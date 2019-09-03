package com.example.weddingapp;

public class Wedding {
    private String nama_wedding, harga;
    private int pic;

    public Wedding(String nama_wedding, String harga, int pic){
        this.nama_wedding = nama_wedding;
        this.harga = harga;
        this.pic = pic;
    }
    public String getWeddingName(){
        return nama_wedding;

    }
    public void setWeddingName(String nama_wedding){
        this.nama_wedding = nama_wedding;

    }
    public int getPic(){

        return pic;
    }
    public void setPic(int pic){

        this.pic = pic;
    }
    public String getHarga(){

        return harga;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
}
