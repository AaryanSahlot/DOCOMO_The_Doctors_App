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

public class myAdapterEYE extends RecyclerView.Adapter<myAdapterEYE.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassEYE> doctorList;

    //2- Constructor
    public myAdapterEYE(Context context, ArrayList<DoctorModelClassEYE> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgEye;
        private TextView docNameEye, docNumberEye, docAddressEye;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgEye = itemView.findViewById(R.id.eyeDoctorImg);
            docNameEye = itemView.findViewById(R.id.eyeDoctorName);
            docNumberEye = itemView.findViewById(R.id.eyeDoctorNumber);
            docAddressEye = itemView.findViewById(R.id.eyeDoctorAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterEYE.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.eyedoctor_list_cardview,parent,false);

        return new myAdapterEYE.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterEYE.ViewHolder holder, int position) {

        DoctorModelClassEYE model = doctorList.get(position);
        holder.docNameEye.setText(model.getDocName());
        holder.docNumberEye.setText(model.getDocNumber());
        holder.docAddressEye.setText(model.getDocAddress());
        holder.docImgEye.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Eye Specialist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

}
