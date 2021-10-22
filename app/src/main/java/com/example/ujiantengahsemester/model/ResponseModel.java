package com.example.ujiantengahsemester.model;

import java.util.List;

public class ResponseModel {
    private String kode_matkul;

    public String getKode_matkul() {
        return kode_matkul;
    }

    public void setKode_matkul(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public List<DataMatakuliah> getData() {
        return data;
    }

    public void setData(List<DataMatakuliah> data) {
        this.data = data;
    }

    private String nama_matkul;
    private String harga;
    private String sks;
    private List<DataMatakuliah> data;


}

