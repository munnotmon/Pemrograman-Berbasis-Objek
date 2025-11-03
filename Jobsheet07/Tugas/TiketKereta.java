package Jobsheet07.Tugas;

public class TiketKereta extends Tiket {
    private String kelasKereta;
    private String namaKereta;
    private String nomorKursi;

    public TiketKereta() {
        super();
        System.out.println("Objek TiketKereta dibuat (tanpa parameter)");
    }

    public TiketKereta(String idTiket, String namaPenumpang, String asal, String tujuan,
                       double harga, String kelasKereta, String namaKereta, String nomorKursi) {
        super(idTiket, namaPenumpang, asal, tujuan, harga); 
        this.kelasKereta = kelasKereta;
        this.namaKereta = namaKereta;
        this.nomorKursi = nomorKursi;
        
        System.out.println("Objek TiketKereta dibuat (dengan parameter)");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nama Kereta     : " + namaKereta);
        System.out.println("Kelas Kereta    : " + kelasKereta);
        System.out.println("Nomor Kursi     : " + nomorKursi);
        System.out.println("------------------------------------\n");
    }
}
