package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_acitivity);
        ButterKnife.bind(this);
        recyclerView.setHasFixedSize(true);
        DividerItemDecoration mDivider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(mDivider);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(DataUtil.getDataList());
        recyclerView.setAdapter(myAdapter);
    }
}