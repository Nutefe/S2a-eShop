package com.esgis.s2aeshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

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
}
