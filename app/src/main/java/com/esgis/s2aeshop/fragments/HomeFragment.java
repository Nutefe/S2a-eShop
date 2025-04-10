package com.esgis.s2aeshop.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.esgis.s2aeshop.R;
import com.esgis.s2aeshop.adapter.ArticleCatAdapter;
import com.esgis.s2aeshop.adapter.ArticleHotAdapter;
import com.esgis.s2aeshop.config.VolleySingleton;
import com.esgis.s2aeshop.models.Article;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment {
    Activity context;
    TextView textView;
    EditText editText;

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_3};

    RecyclerView recyclerView1, recyclerView2;

    private ArticleHotAdapter articleHotAdapter;
    private ArticleCatAdapter articleCatAdapter;

    private List<Article> list1, list2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        if (context != null) {
            context.setTitle(R.string.nav_home);
        }
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        initView(v);

        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        addList();
        loadRecycleView1(list1);
        loadRecycleView2(list2);

        return v;
    }

    private void initView(View v){
        carouselView = v.findViewById(R.id.carouselView);
        recyclerView1 = v.findViewById(R.id.recyclerView1);
        recyclerView2 = v.findViewById(R.id.recyclerView2);
    }

    private void addList(){
        list1 = new ArrayList<>();
        Article article1 = new Article();
        Article article2 = new Article();
        Article article3 = new Article();
        list1.add(article1);
        list1.add(article2);
        list1.add(article3);

        list2 = new ArrayList<>();
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);
        list2.add(article1);

    }

    private void loadRecycleView1(List<Article> articleList){
        articleHotAdapter = new ArticleHotAdapter(articleList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(articleHotAdapter);
    }

    private void loadRecycleView2(List<Article> articleList){
        articleCatAdapter = new ArticleCatAdapter(articleList);
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),4);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(articleCatAdapter);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    private void loadMontantEnc(final String token, String url){

        StringRequest stringDetailUser = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {

                        Log.i("response", response.toString());

                        try {
                            //converting response to json object
                            if (response != null){
                                JSONObject obj = new JSONObject(response);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        String message = null;
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
                        }
                    }
                }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                String auth= "Bearer "+ token;
                headers.put("Authorization", auth);
                return headers;
            }
        };
        VolleySingleton.getInstance(getContext()).addToRequestQueue(stringDetailUser);
    }
}