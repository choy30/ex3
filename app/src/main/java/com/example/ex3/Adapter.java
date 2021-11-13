package com.example.ex3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    List<Fish> fishs;

    public Adapter(Context context, List<Fish> fishs) {
        this.inflater = LayoutInflater.from(context);
        this.fishs = fishs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fishcard, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(fishs.get(position).getName());
        holder.sname.setText(fishs.get(position).getSname());
    }

    @Override
    public int getItemCount() {
        return fishs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, sname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txt_name);
            sname = itemView.findViewById(R.id.txt_sname);
        }
    }
}
