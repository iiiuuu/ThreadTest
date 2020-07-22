package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Data> dataList;

    public MyAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.line_view, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(dataList.get(position).title);
        holder.number.setText(String.valueOf(dataList.get(position).number));
        holder.description.setText(dataList.get(position).description);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView title;
        public TextView number;
        public TextView description;

        public MyViewHolder(View v) {
            super(v);
            view = v;
            title = view.findViewById(R.id.title);
            number = view.findViewById(R.id.number);
            description = view.findViewById(R.id.description);
        }
    }

}
