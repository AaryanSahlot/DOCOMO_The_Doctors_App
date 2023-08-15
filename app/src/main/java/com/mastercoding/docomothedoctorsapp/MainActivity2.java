package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button buttonPhysician, buttonNeurologist, buttonEnt, buttonDentist, buttonEye, buttonOrthopaedist, buttonGastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonPhysician = findViewById(R.id.button2_1);
        buttonNeurologist = findViewById(R.id.button2_2);
        buttonEnt = findViewById(R.id.button2_3);
        buttonDentist = findViewById(R.id.button2_4);
        buttonEye = findViewById(R.id.button2_5);
        buttonOrthopaedist = findViewById(R.id.button2_6);
        buttonGastro = findViewById(R.id.button2_7);

        buttonPhysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_Physician.class);
                startActivity(intent);
            }
        });

        buttonNeurologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_Neurologist.class);
                startActivity(intent);
            }
        });

        buttonEnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_ENTDoctor.class);
                startActivity(intent);
            }
        });

        buttonDentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_Dentist.class);
                startActivity(intent);
            }
        });

        buttonEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_EyeDoctor.class);
                startActivity(intent);
            }
        });

        buttonOrthopaedist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_Orthopaedist.class);
                startActivity(intent);
            }
        });

        buttonGastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity3_Gastro.class);
                startActivity(intent);
            }
        });

    }
}