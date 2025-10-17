package Jobsheet07.Tugas;

public class TiketKereta extends Tiket {
    private String kelasKereta;
    private String namaKereta;
    private String nomorKursi;

    // Constructor tanpa parameter
    public TiketKereta() {
        super(); // panggil constructor superclass tanpa parameter
        System.out.println("Objek TiketKereta dibuat (tanpa parameter)");
    }

    // Constructor berparameter
    public TiketKereta(String idTiket, String namaPenumpang, String asal, String tujuan,
                       double harga, String kelasKereta, String namaKereta, String nomorKursi) {
        super(idTiket, namaPenumpang, asal, tujuan, harga); // panggil superclass berparameter
        this.kelasKereta = kelasKereta;
        this.namaKereta = namaKereta;
        this.nomorKursi = nomorKursi;
        System.out.println("Objek TiketKereta dibuat (dengan parameter)");
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nama Kereta     : " + namaKereta);
        System.out.println("Kelas Kereta    : " + kelasKereta);
        System.out.println("Nomor Kursi     : " + nomorKursi);
        System.out.println("------------------------------------");
    }
}
