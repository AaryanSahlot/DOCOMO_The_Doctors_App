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

public class myAdapterOrthopaedist extends RecyclerView.Adapter<myAdapterOrthopaedist.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassOrthopaedist> doctorList;

    //2- Constructor
    public myAdapterOrthopaedist(Context context, ArrayList<DoctorModelClassOrthopaedist> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgOrthopaedist;
        private TextView docNameOrthopaedist, docNumberOrthopaedist, docAddressOrthopaedist;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgOrthopaedist = itemView.findViewById(R.id.orthopaedistImg);
            docNameOrthopaedist = itemView.findViewById(R.id.orthopaedistName);
            docNumberOrthopaedist = itemView.findViewById(R.id.orthopaedistNumber);
            docAddressOrthopaedist = itemView.findViewById(R.id.orthopaedistAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterOrthopaedist.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orthopaedist_list_cardview,parent,false);

        return new myAdapterOrthopaedist.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterOrthopaedist.ViewHolder holder, int position) {

        DoctorModelClassOrthopaedist model = doctorList.get(position);
        holder.docNameOrthopaedist.setText(model.getDocName());
        holder.docNumberOrthopaedist.setText(model.getDocNumber());
        holder.docAddressOrthopaedist.setText(model.getDocAddress());
        holder.docImgOrthopaedist.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Orthopaedist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }


}
