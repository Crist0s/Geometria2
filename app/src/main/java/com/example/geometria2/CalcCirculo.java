package com.example.geometria2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcCirculo extends AppCompatActivity {

    TextView area;
    EditText r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_circulo);
        area = (TextView) findViewById(R.id.resultadoCirculo);
        r = (EditText) findViewById(R.id.radioCircculo);
    }

    public void calculoCiruclo(View v){

double radio = Double.parseDouble(r.getText().toString());
String auxr = r.getText().toString();
double res = 3.14 * ( radio * radio);
        if(auxr.isEmpty())
        {
            Toast.makeText(this, "No ah ingresado ningun valor",Toast.LENGTH_LONG).show();

        }
        else{
            area.setText(String.valueOf(res) + "cm cuadrados");
        }
    }

}