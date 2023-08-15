package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_EyeDoctor extends AppCompatActivity {

    //1- Data
    ArrayList<DoctorModelClassEYE> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterEYE adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_eye_doctor);

        recyclerView = findViewById(R.id.recyclerViewEyeDoctor);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassEYE("Dr. Davinder Tyagi","09873518513","Vedanta Netralya, C- 16, RDC Raj Nagar, Ghaziabad, UP 201002",R.drawable.davindar));
        arrayList.add(new DoctorModelClassEYE("Dr. Nitin Dua","09891082009","KC-120/C, Kavi Nagar, Ghaziabad, UP 201002",R.drawable.nitin));
        arrayList.add(new DoctorModelClassEYE("Dr. Apex Eye Care","07599976111","SF-277, Second Floor, Gaur City Center Noida Extension, UP 201306",R.drawable.apex));
        arrayList.add(new DoctorModelClassEYE("Dr. Vibhuti Sharan","09873518513","Vedanta Netralya, C- 16, RDC Raj Nagar, Ghaziabad, UP 201002",R.drawable.vibhuti));
        arrayList.add(new DoctorModelClassEYE("Dr. Supreet Juneja","09891082009","KC-120/C, Kavi Nagar, Ghaziabad, UP 201002",R.drawable.supreet));


        adapter = new myAdapterEYE(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}