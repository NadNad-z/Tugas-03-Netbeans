package com.mycompany.tugas03;

public class LukisanCatMinyak extends Lukisan {
    String jenisKanvas;
    String aliran;

    //constructor
    public LukisanCatMinyak(String kode, String judul,
                            String pelukis, int tahun,
                            String lokasiMuseum,
                            String jenisKanvas,
                            String aliran) {
        super(kode, judul, pelukis, tahun, lokasiMuseum);
        this.jenisKanvas = jenisKanvas;
        this.aliran = aliran;
    }

    //method tambahan 1
    void tampilKanvas() {
        System.out.println("Jenis Kanvas    : " + jenisKanvas);
    }

    //method tambahan 2
    void tampilAliran() {
        System.out.println("Aliran          : " + aliran);
    }
}
