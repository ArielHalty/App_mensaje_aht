package com.example.app_mensaje_aht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class spin extends AppCompatActivity {

    private Spinner sp1;
    private EditText eText1, eText2;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp1 = (Spinner) findViewById(R.id.sp1);
        eText1 = (EditText) findViewById(R.id.eText1);
        eText2 = (EditText) findViewById(R.id.eText2);
        textView1 = (TextView) findViewById(R.id.tv_resultado);


        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);
    }

    //Método del botón
    public void Calcular(View view) {
        try {
            String valor1_String = eText1.getText().toString();
            String valor2_String = eText2.getText().toString();

            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);

            String seleccion = sp1.getSelectedItem().toString();
            if (seleccion.equals("Sumar")) {
                int suma = valor1_int + valor2_int;
                String resultado = String.valueOf(suma);
                textView1.setText(resultado);

            } else if (seleccion.equals("Restar")) {
                int resta = valor1_int - valor2_int;
                String resultado = String.valueOf(resta);
                textView1.setText(resultado);
            } else if (seleccion.equals("Multiplicar")) {
                int multiplicar = valor1_int * valor2_int;
                String resultado = String.valueOf(multiplicar);
                textView1.setText(resultado);
            } else if (seleccion.equals("Dividir")) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                textView1.setText(resultado);

                if (valor2_int != 0) {
                    int division = valor1_int / valor2_int;
                    String resultado1 = String.valueOf(division);
                    textView1.setText(resultado1);
                } else {
                    Toast.makeText(this, "No se puede dividir entre 0, por favor, intente nuevamente", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e){
            Toast.makeText(this, "Ingrese números", Toast.LENGTH_SHORT).show();
        }
    }
}



