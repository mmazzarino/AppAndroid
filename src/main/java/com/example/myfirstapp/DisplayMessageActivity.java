package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_message);

        Bundle extras = getIntent().getExtras();

        float valorEmp = Float.parseFloat(extras.getString("valor1"));
        int numParc = Integer.parseInt(extras.getString("valor2"));
        float taxaJur = (Float.parseFloat(extras.getString("valor3"))/100);

        float mensalidadeSemJuros = valorEmp/numParc;
        float jurosTotal = 0;
        float jurosMes;
        float valorNaoPago = valorEmp;
        float valorTotalPago = 0;
        float valorParcela = 0;
        float porcentagemJurosTotal;

        for(int cont = 0; cont < numParc; cont++){
            jurosMes = 0;
            jurosMes = valorNaoPago * taxaJur;
            valorNaoPago -= mensalidadeSemJuros;
            jurosTotal += jurosMes;
        }

        valorTotalPago = jurosTotal + valorEmp;
        valorParcela = valorTotalPago/numParc;
        porcentagemJurosTotal = ((jurosTotal/valorEmp) * 100);


        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView9 = findViewById(R.id.textView9);
        TextView textView11 = findViewById(R.id.textView11);

        textView.setText("R$ " + Float.toString(valorTotalPago));
        textView2.setText("R$ " + Float.toString(valorParcela));
        textView9.setText("R$ " + Float.toString(jurosTotal));
        textView11.setText((Float.toString(porcentagemJurosTotal)) + "%");
    }
}
