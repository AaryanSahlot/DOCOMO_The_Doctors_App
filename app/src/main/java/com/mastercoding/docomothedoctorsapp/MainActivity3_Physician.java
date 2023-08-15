package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_Physician extends AppCompatActivity {

    //1- Data
    ArrayList<DoctorModelClassPhysician> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterPhysician adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_physician);

        recyclerView = findViewById(R.id.recyclerViewPhysician);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassPhysician("Dr. Amit Rai","09810260922","R-8/32, RDC Rajnagar, Ghaziabad, UP 201002",R.drawable.amit_rai));
        arrayList.add(new DoctorModelClassPhysician("Dr. AK Jain","09910315991","175, GF, Gyankhand 4, Indirapuram, Ghaziabad, UP 201010",R.drawable.anujdoctor));
        arrayList.add(new DoctorModelClassPhysician("Dr. Sreekanth M.K.S","08527278177","F- 303, Ahinsa Khand 2, Indirapuram, Ghaziabad, UP 201014",R.drawable.pdrsreekanth));
        arrayList.add(new DoctorModelClassPhysician("Dr. Sushil Upadhyay","09899393006","VPF-5, Ahinsa Khand 1, Indirapuram, Ghaziabad, UP 201014",R.drawable.sushildaktar));
        arrayList.add(new DoctorModelClassPhysician("Dr. Ankit Gupta","08527918540","Clinic 1 Sumitra Hospital Sector 35, Noida, UP 201301",R.drawable.ankitdaktar));


        adapter = new myAdapterPhysician(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}