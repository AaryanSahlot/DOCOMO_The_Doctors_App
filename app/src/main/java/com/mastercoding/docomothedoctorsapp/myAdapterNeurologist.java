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

public class myAdapterNeurologist  extends RecyclerView.Adapter<myAdapterNeurologist.ViewHolder>{


    //1- Data
    private Context context;
    private ArrayList<DoctorModelClassNeurologist> doctorList;

    //2- Constructor
    public myAdapterNeurologist(Context context, ArrayList<DoctorModelClassNeurologist> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView docImgNeuro;
        private TextView docNameNeuro, docNumberNeuro, docAddressNeuro;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            docImgNeuro = itemView.findViewById(R.id.neurologistImg);
            docNameNeuro = itemView.findViewById(R.id.neurologistName);
            docNumberNeuro = itemView.findViewById(R.id.neurologistNumber);
            docAddressNeuro = itemView.findViewById(R.id.neurologistAddress);
        }
    }


    @NonNull
    @Override
    public myAdapterNeurologist.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.neurologist_list_cardview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterNeurologist.ViewHolder holder, int position) {

        DoctorModelClassNeurologist model = doctorList.get(position);
        holder.docNameNeuro.setText(model.getDocName());
        holder.docNumberNeuro.setText(model.getDocNumber());
        holder.docAddressNeuro.setText(model.getDocAddress());
        holder.docImgNeuro.setImageResource(model.getDocImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,
                        ""+doctorList.get(position).getDocName()+"\nis a Very Renowned Neurologist", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }


}
