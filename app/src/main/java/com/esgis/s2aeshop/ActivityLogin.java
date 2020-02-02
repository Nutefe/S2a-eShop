package com.esgis.s2aeshop;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.esgis.s2aeshop.config.ServerConfig;
import com.esgis.s2aeshop.config.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewCreate, textViewForget;
    private AppCompatButton buttonLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        initLisner();
    }

    private void initView(){
        textViewCreate = findViewById(R.id.btnnewaccount);
        textViewForget = findViewById(R.id.forgetPass);
        buttonLogin = findViewById(R.id.btnLogin);
    }

    private void initLisner(){
        textViewCreate.setOnClickListener(this);
        textViewForget.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnnewaccount:
                Intent intentCreate = new Intent(this, ActivityTypeCompte.class);
                startActivity(intentCreate);
                break;
            case R.id.forgetPass:
                Intent intentForget = new Intent(this, ActivityForgetPassword.class);
                startActivity(intentForget);
                break;
            case R.id.btnLogin:
                Intent intentMain = new Intent(this, MainActivity.class);
                startActivity(intentMain);
                break;
        }
    }

    private void login(){
        final String pass = "";

        //Toast.makeText(this, pass, Toast.LENGTH_SHORT).show();

        Map<String, String> params = new HashMap<>();
        params.put("username", Build.ID);
        params.put("password", pass);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, ServerConfig.url_signig,
                new JSONObject(params),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("respons", response.toString());

                        try {
                            if (response != null){

                                String token = response.getString("accessToken");

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String message = "";
                if (error instanceof NetworkError) {
                    message = "Cannot connect to Internet...Please check your connection!";
                } else if (error instanceof ServerError) {
                    message = "The server could not be found. Please try again after some time!!";
                } else if (error instanceof AuthFailureError) {
                    message = "Cannot connect to Internet...Please check your connection!";
                } else if (error instanceof ParseError) {
                    message = "Parsing error! Please try again after some time!!";
                } else if (error instanceof NoConnectionError) {
                    message = "Cannot connect to Internet...Please check your connection!";
                } else if (error instanceof TimeoutError) {
                    message = "Connection TimeOut! Please check your internet connection.";
                } else {
                    message = "Username ou mot de passe incorrecte";
                }
                Log.i("login_erreur", message);
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                return headers;
            }
        };
        VolleySingleton.getInstance(this).addToRequestQueue(request);
    }
}
