package com.example.gambiarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText valorDollar, qntDollar;
    TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        valorDollar = findViewById(R.id.valorDollar);
        qntDollar = findViewById(R.id.qntDollar);

        txtresult = findViewById(R.id.txtresult);

    }

    public void calcule(View view){

        double quantsdollar = Double.parseDouble(qntDollar.getText().toString());
        double valuedollar = Double.parseDouble(valorDollar.getText().toString());

        double totalcash = quantsdollar * valuedollar ;


        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorConvert = decimal.format(totalcash);


        txtresult.setText("R$:" + totalcash);



    }

    public void mudatela(View ssss) {
        Intent s = new Intent( this, tela3.class);
        startActivity(s);
        Toast.makeText(this, "Bem vindo!!", Toast.LENGTH_LONG).show();

    }

    public void resets(View sfdf){

        valorDollar.setText("");
        qntDollar.setText("");
        txtresult.setText("");
    }




}