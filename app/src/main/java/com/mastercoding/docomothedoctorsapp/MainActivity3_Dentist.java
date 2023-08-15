package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_Dentist extends AppCompatActivity {

    //1- Data
    ArrayList<DoctorModelClassDentist> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterDentist adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_dentist);

        recyclerView = findViewById(R.id.recyclerViewDentist);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassDentist("Dr. Neeraj Kumar","09717353515","22, KINGS AVENUE, Crossings Republik, Ghaziabad, UP 201016",R.drawable.neeraj));
        arrayList.add(new DoctorModelClassDentist("Dr. Gul's","09703878600","WP-4, 1st Floor, Hazipur, Sector 104, Noida, UP 201301",R.drawable.guls));
        arrayList.add(new DoctorModelClassDentist("Dr. Kavita Mishra","09319229907","2/34, Block-E-3, GH-07, Crossings Republik, Ghaziabad, UP 201016",R.drawable.kavita));
        arrayList.add(new DoctorModelClassDentist("Dr. Prashant Acharya","09818257365","1stFloor, Galleria Market-1, Crossings Republik, Ghaziabad, UP 201016",R.drawable.prashant));
        arrayList.add(new DoctorModelClassDentist("Dr. Nivedita's","09818889810","G49C Greater Noida W Rd, Haibatpur, Ghaziabad, UP 201318",R.drawable.nividita));


        adapter = new myAdapterDentist(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}