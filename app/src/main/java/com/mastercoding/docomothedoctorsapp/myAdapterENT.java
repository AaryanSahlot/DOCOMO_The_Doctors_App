package com.mastercoding.docomothedoctorsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapterENT extends RecyclerView.Adapter<myAdapterENT.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassENT> doctorList;

    //2- Constructor
    public myAdapterENT(Context context, ArrayList<DoctorModelClassENT> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgENT;
        private TextView docNameENT, docNumberENT, docAddressENT;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgENT = itemView.findViewById(R.id.entDoctorImg);
            docNameENT = itemView.findViewById(R.id.entDoctorName);
            docNumberENT = itemView.findViewById(R.id.entDoctorNumber);
            docAddressENT = itemView.findViewById(R.id.entDoctorAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterENT.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.entdoctor_list_cardview,parent,false);

        return new myAdapterENT.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterENT.ViewHolder holder, int position) {

        DoctorModelClassENT model = doctorList.get(position);
        holder.docNameENT.setText(model.getDocName());
        holder.docNumberENT.setText(model.getDocNumber());
        holder.docAddressENT.setText(model.getDocAddress());
        holder.docImgENT.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned ENT Specialist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

}
