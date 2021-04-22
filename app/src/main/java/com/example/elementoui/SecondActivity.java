package com.example.elementoui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);

        texto = findViewById(R.id.textViewSecond);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String saludo = bundle.getString("saludo");
            Toast.makeText(SecondActivity.this,saludo, Toast.LENGTH_LONG).show();
            texto.setText(saludo);
        }else{
            Toast.makeText(SecondActivity.this, "esta vacio", Toast.LENGTH_LONG).show();
        }
    }
}