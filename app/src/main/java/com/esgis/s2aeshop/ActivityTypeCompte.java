package com.esgis.s2aeshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.CheckBox;

public class ActivityTypeCompte extends AppCompatActivity implements View.OnClickListener{

    private CheckBox checkAcheteur, checkFournisseur, checkLivreur;

    private AppCompatButton btnValider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_compte);

        initView();
        initListner();
    }


    private void initView(){
        checkAcheteur = findViewById(R.id.checkAcheteur);
        checkFournisseur = findViewById(R.id.checkFournisseur);
        checkLivreur = findViewById(R.id.checkLivreur);
        btnValider = findViewById(R.id.btnValider);
    }

    private void initListner(){
        btnValider.setOnClickListener(this);
        checkAcheteur.setOnClickListener(this);
        checkFournisseur.setOnClickListener(this);
        checkLivreur.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnValider:
                if (checkAcheteur.isChecked()){
                    Intent intentSimple = new Intent(this, ActivityCreateSimpleCompte.class);
                    startActivity(intentSimple);
                }

                if (checkFournisseur.isChecked()){
                    Intent intent = new Intent(this, ActivityCreateFournisseurCompte1.class);
                    startActivity(intent);
                }

                if (checkLivreur.isChecked()){
                    Intent intent = new Intent(this, ActivityCreateFournisseurCompte1.class);
                    startActivity(intent);
                }
                break;
            case R.id.checkAcheteur:
                checkFournisseur.setChecked(false);
                checkLivreur.setChecked(false);
                break;
            case R.id.checkFournisseur:
                checkAcheteur.setChecked(false);
                checkLivreur.setChecked(false);
                break;
            case R.id.checkLivreur:
                checkAcheteur.setChecked(false);
                checkFournisseur.setChecked(false);
                break;
        }
    }
}
