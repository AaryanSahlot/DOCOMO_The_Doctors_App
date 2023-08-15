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

public class myAdapterDentist extends RecyclerView.Adapter<myAdapterDentist.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassDentist> doctorList;

    //2- Constructor
    public myAdapterDentist(Context context, ArrayList<DoctorModelClassDentist> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgDentist;
        private TextView docNameDentist, docNumberDentist, docAddressDentist;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgDentist = itemView.findViewById(R.id.dentistImg);
            docNameDentist = itemView.findViewById(R.id.dentistName);
            docNumberDentist = itemView.findViewById(R.id.dentistNumber);
            docAddressDentist = itemView.findViewById(R.id.dentistAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterDentist.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dentist_list_cardview,parent,false);

        return new myAdapterDentist.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterDentist.ViewHolder holder, int position) {

        DoctorModelClassDentist model = doctorList.get(position);
        holder.docNameDentist.setText(model.getDocName());
        holder.docNumberDentist.setText(model.getDocNumber());
        holder.docAddressDentist.setText(model.getDocAddress());
        holder.docImgDentist.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Dentist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }


}
