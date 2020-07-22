package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter {
    List<Data> dataList;

    public MyAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        switch (viewType) {
            case Data.TYPE_HEADER:
                v = (View) LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.head_bar, parent, false);
                return new HeaderTextViewHolder(v);
            case Data.TYPE_ITEM:
                v = (View) LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.line_view, parent, false);
                return new TextViewHolder(v);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).type;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (dataList.get(position).type) {
            case Data.TYPE_HEADER:
                ((HeaderTextViewHolder) holder).headerText.setText(dataList.get(position).title);
                break;
            case Data.TYPE_ITEM:
                ((TextViewHolder) holder).title.setText(dataList.get(position).title);
                ((TextViewHolder) holder).number.setText(String.valueOf(dataList.get(position).number));
                ((TextViewHolder) holder).description.setText(dataList.get(position).description);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView title;
        public TextView number;
        public TextView description;

        public TextViewHolder(View v) {
            super(v);
            view = v;
            title = view.findViewById(R.id.title);
            number = view.findViewById(R.id.number);
            description = view.findViewById(R.id.description);
        }
    }

    public static class HeaderTextViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headerText;

        public HeaderTextViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            headerText = view.findViewById(R.id.header_text);
        }
    }

}
