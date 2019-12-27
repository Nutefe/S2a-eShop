package com.esgis.s2aeshop.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.esgis.s2aeshop.R;

public class LoginFragment extends Fragment {

    Activity context;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        if (context != null) {
            context.setTitle(R.string.nav_login);
        }
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_login, container, false);


        return view;

    }
}