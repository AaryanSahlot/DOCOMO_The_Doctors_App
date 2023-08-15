package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_Neurologist extends AppCompatActivity {

    //1- Data
    ArrayList<DoctorModelClassNeurologist> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterNeurologist adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_neurologist);

        recyclerView = findViewById(R.id.recyclerViewNeurologist);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassNeurologist("Dr. Rakesh Kumar","07838395178","Yashoda hospital, Ram Nagar, Nehru Nagar III, Ghaziabad, UP 201001",R.drawable.rakeshneuro));
        arrayList.add(new DoctorModelClassNeurologist("Dr. Manish Sinha","08527172999","Shop No-5, Greater Noida W Rd, near Gaur City 1, Noida, UP 201009",R.drawable.manishneuro));
        arrayList.add(new DoctorModelClassNeurologist("Dr. Abhinav Gupta","07678306279","33f, Ganga Banquet Rd, Sector 5, RajendraNagar, Sahiababd, UP 201005",R.drawable.abhinavneuro));
        arrayList.add(new DoctorModelClassNeurologist("Dr. Dipanshu Narula","09772348065","GrihaPravesh, 1203-SaketTower, Society, Sector 77, Noida, UP 201304",R.drawable.dipanshuneuro));
        arrayList.add(new DoctorModelClassNeurologist("Dr. Puneet Malik","08527918540","Yashoda hospital, Ram Nagar, Nehru Nagar III, Ghaziabad, UP 201001",R.drawable.puneetneuro));


        adapter = new myAdapterNeurologist(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}