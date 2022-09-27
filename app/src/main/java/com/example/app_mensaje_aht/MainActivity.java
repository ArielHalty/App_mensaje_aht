package com.example.app_mensaje_aht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private EditText inputName;
    private Button btn_Saludar;
    private Button btn_Borrar;
    private Button btn_LanzarAct3;
    private RadioGroup radioGroup;
    private RadioButton rbUbicacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rgUbicacion);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Toast.makeText(getApplicationContext(), " Seleccionada", Toast.LENGTH_SHORT).show();
                rbUbicacion = findViewById(radioGroup.getCheckedRadioButtonId());
                Log.i("INFO",rbUbicacion.getText().toString());

            }
        });
        resultado = findViewById(R.id.resultado);
        inputName = findViewById(R.id.input_Name);
        btn_Saludar = findViewById(R.id.boton_Saludar);
        btn_Borrar = findViewById(R.id.boton_Borrar);
        btn_LanzarAct3 = findViewById(R.id.btn_activity3);


        btn_Borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
                inputName.setText("");
            }
        });
        Log.i("Info: ", "onCreate");

    }

    public void saludar(View view) {
        try {
            resultado.setText("Hola " + inputName.getText().toString() + "!");

        } catch (Exception e) {
            Toast.makeText(this, "Ingrese su nombre", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info: ", "onStart");
    }
    public void iniciarAct2 (View view) {

                Intent i = new Intent(this, SecondActivity.class);
                if (view.getId() == R.id.btn_activity2) {
                    startActivity(i);
                } else {
                    i.putExtra("dato", "Hola amigos");
                    i.putExtra("dato2", "Hola amigos2");
                    startActivity(i);
        }
    }


    public void iniciarAct3 (View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    public void iniciarAct4 (View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
    public void iniciarAct5 (View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
    public void iniciarAct6(View view){
        Intent i = new Intent(this, SixthActivity.class);
        startActivity(i);
    }


    protected void onResume() {
        super.onResume();
        Log.i("Info: ", "onResume");
    }


    protected void onPause() {
        super.onPause();

        Log.i("Info: ", "onPause");
    }
    protected void onStop() {
        super.onStop();

        Log.i("Info: ", "onStop");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Info: ", "onDestroy");
    }
}