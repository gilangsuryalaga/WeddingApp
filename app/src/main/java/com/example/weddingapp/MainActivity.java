package com.example.weddingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView,mRecyclerView2;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Wedding> weddingList;
    private WeddingAdapter weddingAdapter;

    String[] wedding_name ={"Wedding1","Wedding2","Wedding3","Wedding4","Wedding5","Wedding6","Wedding7","Wedding8","Wedding9","Wedding10"};

    String[] harga = {"1Jt","2Jt","3Jt","4Jt","5Jt","6Jt","7Jt","8Jt","9Jt","10Jt"};

    int[] pic = {
            R.drawable.wedding1,
            R.drawable.wedding2,
            R.drawable.wedding3,
            R.drawable.wedding4,
            R.drawable.wedding5,
            R.drawable.wedding6,
            R.drawable.wedding7,
            R.drawable.wedding8,
            R.drawable.wedding9,
            R.drawable.wedding10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        if (mRecyclerView != null){
            mRecyclerView.setHasFixedSize(true);
        }
        mLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);

        mRecyclerView.setLayoutManager(mLayoutManager);

        weddingList = new ArrayList<>();

        for (int i = 0; i < wedding_name.length;i++){
            Wedding wedding = new Wedding(wedding_name[i],harga[i],pic[i]);

            weddingList.add(wedding);
        }
        weddingAdapter = new WeddingAdapter(weddingList);

        mRecyclerView.setAdapter(weddingAdapter);
        weddingAdapter.notifyDataSetChanged();

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {


            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this,"Card At " + position + " Is Clicked", Toast.LENGTH_SHORT).show();
            }
        }));


//     mRecyclerView2


        mRecyclerView2 = (RecyclerView)findViewById(R.id.recycler_view2);

        if (mRecyclerView2 != null){
            mRecyclerView2.setHasFixedSize(true);
        }
        mLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);

        mRecyclerView2.setLayoutManager(mLayoutManager);

        weddingList = new ArrayList<>();

        for (int i = 0; i < wedding_name.length;i++){
            Wedding wedding = new Wedding(wedding_name[i],harga[i],pic[i]);

            weddingList.add(wedding);
        }
        weddingAdapter = new WeddingAdapter(weddingList);

        mRecyclerView2.setAdapter(weddingAdapter);
        weddingAdapter.notifyDataSetChanged();

        mRecyclerView2.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {


            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this,"Card At " + position + " Is Clicked", Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
