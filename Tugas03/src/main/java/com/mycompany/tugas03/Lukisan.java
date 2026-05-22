package com.mycompany.tugas03;

public class Lukisan {
    // atribut
    String kode;
    String judul;
    String pelukis;
    int tahun;
    String lokasiMuseum;

    //constructor kosong
    public Lukisan() {}

    //constructor 1 parameter
    public Lukisan(String judul) {
        this.judul = judul;
    }

    //constructor lengkap
    public Lukisan(String kode, String judul,
                   String pelukis, int tahun,
                   String lokasiMuseum) {
        this.kode = kode;
        this.judul = judul;
        this.pelukis = pelukis;
        this.tahun = tahun;
        this.lokasiMuseum = lokasiMuseum;
    }

    //method tanpa return
    void tampilData() {
        System.out.println("Kode            : " + kode);
        System.out.println("Judul           : " + judul);
        System.out.println("Pelukis         : " + pelukis);
        System.out.println("Tahun           : " + tahun);
        System.out.println("Lokasi Museum   : " + lokasiMuseum);
    }
    
    //dengan nilai balik
    String getLokasiMuseum() {
        return lokasiMuseum;
    }

    void create() {
        String sql = "INSERT INTO lukisan VALUES('"
                + kode + "','" + judul + "','" + pelukis + "',"
                + tahun + ",'" + lokasiMuseum + "')";
        System.out.println("SQL CREATE");
        System.out.println(sql);
    }

    void read() {
        String sql = "SELECT * FROM lukisan";
        System.out.println("SQL READ");
        System.out.println(sql);
    }

    void update() {
        String sql = "UPDATE lukisan SET judul='" + judul + "' WHERE kode='" + kode + "'";
        System.out.println("SQL UPDATE");
        System.out.println(sql);
    }

    void delete() {
        String sql = "DELETE FROM lukisan WHERE kode='" + kode + "'";
        System.out.println("SQL DELETE");
        System.out.println(sql);
    }
}
