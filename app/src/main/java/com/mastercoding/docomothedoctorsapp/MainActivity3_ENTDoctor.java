package com.mastercoding.docomothedoctorsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3_ENTDoctor extends AppCompatActivity {

    //1- Data
    ArrayList<DoctorModelClassENT> arrayList;

    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    myAdapterENT adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_entdoctor);

        recyclerView = findViewById(R.id.recyclerViewEntDoctor);

        arrayList = new ArrayList<>();
        arrayList.add(new DoctorModelClassENT("Dr. Omveer Singh","09205912306","R-2/11, RDC Rajnagar, Ghaziabad, UP 201002",R.drawable.omveerent));
        arrayList.add(new DoctorModelClassENT("Dr. Suman Parmar's","08287837015","FF-111, Opp Gaur city 2, Phase-2, Greater Noida, UP 201309",R.drawable.sumanent));
        arrayList.add(new DoctorModelClassENT("Dr. S.M. Gupta","09910770562","G-35B Gulmohur Greens, Mohan Nagar, Ghaziabad, UP 201007",R.drawable.sment));
        arrayList.add(new DoctorModelClassENT("Dr. Vasun Batra's","08076898283","141, 1st floor Mahagun Mart, Greater Noida W, Sector16C, UP 201009",R.drawable.vasunent));
        arrayList.add(new DoctorModelClassENT("Dr. ABHAY SINGH","08588843234","4/417, Sector 5, Vaishali, Ghaziabad, UP 201010",R.drawable.abhayent));


        adapter = new myAdapterENT(this, arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}