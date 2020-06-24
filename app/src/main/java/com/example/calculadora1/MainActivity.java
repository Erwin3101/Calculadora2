package com.example.calculadora1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    Button suma;
    TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numero1);
        suma = (Button) findViewById(R.id.suma);
        resultados = (TextView) findViewById(R.id.resultados);

        //Click

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(numero1.getText().toString());
                double sumatoria = num1 + 10;
                resultados.setText(Double.toString(sumatoria));
            }
        });
    }
}