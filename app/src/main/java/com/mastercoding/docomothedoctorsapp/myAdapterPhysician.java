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

public class myAdapterPhysician extends RecyclerView.Adapter<myAdapterPhysician.ViewHolder> {

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassPhysician> doctorList;

    //2- Constructor
    public myAdapterPhysician(Context context, ArrayList<DoctorModelClassPhysician> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImg;
        private TextView docName, docNumber, docAddress;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImg = itemView.findViewById(R.id.physicianImg);
            docName = itemView.findViewById(R.id.physicianName);
            docNumber = itemView.findViewById(R.id.physicianNumber);
            docAddress = itemView.findViewById(R.id.physicianAddress);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.physicians_list_cardview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        DoctorModelClassPhysician model = doctorList.get(position);
        holder.docName.setText(model.getDocName());
        holder.docNumber.setText(model.getDocNumber());
        holder.docAddress.setText(model.getDocAddress());
        holder.docImg.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Physician", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }


}
