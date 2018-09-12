package com.example.tesoem.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        nombre= (EditText) findViewById(R.id.txtnombre);
    }

    void envia (View v){
        Intent enviar = new Intent(this, RecibeActivity.class);

        enviar.putExtra("nombre",nombre.getText().toString());
        startActivity(enviar);
        this.finish();
    }
}
