package com.example.weddingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeddingAdapter extends RecyclerView.Adapter<WeddingAdapter.ViewHolder> {
    private List<Wedding> weddingList;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private List<Wedding> weddingList;

        public TextView WeddingName,Harga;
        public ImageView Album;

        public ViewHolder(View v) {
            super(v);
            this.weddingList = weddingList;
            WeddingName = (TextView)v.findViewById(R.id.wedding_name);
            Harga = (TextView)v.findViewById(R.id.harga);
            Album = (ImageView)v.findViewById(R.id.album);

        }
    }
    public WeddingAdapter(List<Wedding> weddingList){

        this.weddingList= weddingList;

    }
    public WeddingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_wedding,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(WeddingAdapter.ViewHolder holder, int position) {
        Wedding wedding = weddingList.get(position);
        holder.WeddingName.setText(String.valueOf(wedding.getWeddingName()));
        holder.Harga.setText(String.valueOf(wedding.getHarga()));
        holder.Album.setImageResource(wedding.getPic());
    }

    @Override
    public int getItemCount() {
        return weddingList.size();
    }
}

