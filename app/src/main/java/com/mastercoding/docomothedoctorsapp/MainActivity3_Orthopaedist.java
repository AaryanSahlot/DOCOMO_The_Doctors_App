package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_Orthopaedist extends AppCompatActivity {


    //1- Data
    ArrayList<DoctorModelClassOrthopaedist> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterOrthopaedist adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_orthopaedist);

        recyclerView = findViewById(R.id.recyclerViewOrthopaedist);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassOrthopaedist("Dr. K. K. Mittal","91 1161260801","J-85, Patel Nagar-1, Near Old Bus Stand, Ghaziabad, UP 201001",R.drawable.kkmittal));
        arrayList.add(new DoctorModelClassOrthopaedist("Dr. Anchit Uppal","09310343041","Sarvodaya Hospital, Ghaziabad, UP 201009",R.drawable.anchit));
        arrayList.add(new DoctorModelClassOrthopaedist("Dr. S.S Chandel","07807073085","RfhD, opposite Panchmukhi Hanuman Mandir, Sector2, Greater Noida, UP 201306",R.drawable.sschandel));
        arrayList.add(new DoctorModelClassOrthopaedist("Dr. Garg","08527554446","409, Orbit Plaza, crossing Republik, Ghazaibad, UP 201016",R.drawable.garg));
        arrayList.add(new DoctorModelClassOrthopaedist("Dr. B K Jain","01204211221","343, Padmana Naidu Marg, Shakti Khand III, Indirapuram, Ghaziabad, UP 201014",R.drawable.arihant));


        adapter = new myAdapterOrthopaedist(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}