package com.example.geometria2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.geometria2.CalcCirculo;
import com.example.geometria2.CalcRectangulo;
import com.example.geometria2.CalcTriangulo;
import com.example.geometria2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void areaCirculo(View v)
    {
        Intent i = new Intent(this, CalcCirculo.class);
        startActivity(i);
    }

    public void areaRectangulo(View v)
    {
        Intent i = new Intent(this, CalcRectangulo.class);
        startActivity(i);
    }

    public void areaTriangulo(View v)
    {
        Intent i = new Intent(this, CalcTriangulo.class);
        startActivity(i);
    }



}