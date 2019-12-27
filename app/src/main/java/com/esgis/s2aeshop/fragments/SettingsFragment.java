package com.esgis.s2aeshop.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.esgis.s2aeshop.AjouterCarte;
import com.esgis.s2aeshop.ChangePassword;
import com.esgis.s2aeshop.R;

public class SettingsFragment extends Fragment implements View.OnClickListener{

    Activity context;
    TextView textViewLG, textViewCP, textViewAC;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        if (context != null) {
            context.setTitle(R.string.nav_settings);
        }
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        initView(view);
        initListner();

        return view;

    }

    private void initView(View view){
        textViewLG = view.findViewById(R.id.text_settings);
        textViewCP = view.findViewById(R.id.btnchangepassword);
        textViewAC = view.findViewById(R.id.btnaddcard);
    }

    private void initListner(){
        textViewLG.setOnClickListener(this);
        textViewCP.setOnClickListener(this);
        textViewAC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnchangepassword:
                Intent intent = new Intent(getContext(), ChangePassword.class);
                startActivity(intent);
                break;

            case R.id.btnaddcard:
                Intent intent2 = new Intent(getContext(), AjouterCarte.class);
                startActivity(intent2);
                break;
        }
    }
}