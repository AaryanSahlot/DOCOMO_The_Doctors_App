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

public class myAdapterGastro extends RecyclerView.Adapter<myAdapterGastro.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassGastro> doctorList;

    //2- Constructor
    public myAdapterGastro(Context context, ArrayList<DoctorModelClassGastro> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgGastro;
        private TextView docNameGastro, docNumberGastro, docAddressGastro;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgGastro = itemView.findViewById(R.id.gastroImg);
            docNameGastro = itemView.findViewById(R.id.gastroName);
            docNumberGastro = itemView.findViewById(R.id.gastroNumber);
            docAddressGastro = itemView.findViewById(R.id.gastroAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterGastro.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gastro_list_cardview,parent,false);

        return new myAdapterGastro.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterGastro.ViewHolder holder, int position) {

        DoctorModelClassGastro model = doctorList.get(position);
        holder.docNameGastro.setText(model.getDocName());
        holder.docNumberGastro.setText(model.getDocNumber());
        holder.docAddressGastro.setText(model.getDocAddress());
        holder.docImgGastro.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Gastroenterologist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }


}
