package com.mycompany.tugas03;

public class Main {
    public static void main(String[] args) {
        // object constructor kosong
        Lukisan l1 = new Lukisan();
        l1.kode = "L001";
        l1.judul = "Penangkapan Pangeran Diponogoro";
        l1.pelukis = "Raden Saleh";
        l1.tahun = 1857;
        l1.lokasiMuseum = "Museum Istana Kepresidenan Yogyakarta                                                               ";
        l1.tampilData();
        System.out.println();

        // object constructor 1 parameter
        Lukisan l2 = new Lukisan("Mona Lisa");
        l2.kode = "L002";
        l2.pelukis = "Leonardo da Vinci";
        l2.tahun = 1503;
        l2.lokasiMuseum = "Museum Louvre";
        l2.tampilData();
        System.out.println();

        // object constructor lengkap
        Lukisan l3 = new Lukisan("L003", "The Starry Night", "Van Gogh", 1889, "Museum of Modern Art");
        l3.tampilData();

        System.out.println();

        //Jalankan semua CRUD
        l3.create();
        System.out.println();
        l3.read();
        System.out.println();
        l3.update();
        System.out.println();
        l3.delete();
        System.out.println();

        // method return
        System.out.println("Lokasi Museum   : " + l3.getLokasiMuseum());
        System.out.println();

        // object subclass
        LukisanCatMinyak lm = new LukisanCatMinyak("L004", "Ophelia", "Jonh Everett Millais", 1852,
                "Museum Tate Britain", "Kanvas Linen", "Pra-Raphaelite");
        lm.tampilData();
        System.out.println();
        lm.tampilKanvas();
        lm.tampilAliran();
    }
}



