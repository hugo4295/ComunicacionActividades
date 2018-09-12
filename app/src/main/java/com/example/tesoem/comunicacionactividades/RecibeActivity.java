package com.example.tesoem.comunicacionactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecibeActivity extends AppCompatActivity {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe);

        nombre = (TextView) findViewById(R.id.lblnombre);

        Bundle parametros = getIntent().getExtras();

        nombre.setText(parametros.getString("nombre"));
    }
}
