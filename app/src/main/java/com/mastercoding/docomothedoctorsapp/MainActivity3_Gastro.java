package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_Gastro extends AppCompatActivity {


    //1- Data
    ArrayList<DoctorModelClassGastro> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterGastro adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_gastro);

        recyclerView = findViewById(R.id.recyclerViewGastro);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassGastro("Dr. Manish Kak","09654999187","B - 3, Vrinda Diagnostics, Nehru Nagar III, Ghaziabad, UP 201001",R.drawable.manishkak));
        arrayList.add(new DoctorModelClassGastro("Dr. Sushrut Singh","09315354431","Fortis Hospital, B-22, D Block, Sector 62, Noida, UP 201301",R.drawable.sushrut));
        arrayList.add(new DoctorModelClassGastro("Dr. Manish Gupta","09968635204","100, Shakti Khand 2, Indirapuram, Ghaziabad, UP 201014",R.drawable.manishkumar));
        arrayList.add(new DoctorModelClassGastro("Dr. Amit Jain","09555595859","212/D, CN Healthcare Multi-Speciality Clinic, Sector 61, Noida, UP 201303",R.drawable.amitjain));
        arrayList.add(new DoctorModelClassGastro("Dr. Vishal Garg","08130449297","A 16, Block A, Sector 22, Noida, Uttar Pradesh 201301",R.drawable.vishal));



        adapter = new myAdapterGastro(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}