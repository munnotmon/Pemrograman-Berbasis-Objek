package Jobsheet07.Tugas;
public class Tiket {
    protected String idTiket;
    protected String namaPenumpang;
    protected String asalStasiun;
    protected String tujuanStasiun;
    protected double harga;

    public Tiket() {
        System.out.println("Objek Tiket dibuat (tanpa parameter)");
    }

    public Tiket(String idTiket, String namaPenumpang, String asalStasiun, String tujuanStasiun, double harga) {
        this.idTiket = idTiket;
        this.namaPenumpang = namaPenumpang;
        this.asalStasiun = asalStasiun;
        this.tujuanStasiun = tujuanStasiun;
        this.harga = harga;
        System.out.println("\nObjek Tiket dibuat (dengan parameter)");
    }

    public void displayInfo() {
        System.out.println("ID Tiket        : " + idTiket);
        System.out.println("Nama Penumpang  : " + namaPenumpang);
        System.out.println("Asal Stasiun    : " + asalStasiun);
        System.out.println("Tujuan Stasiun  : " + tujuanStasiun);
        System.out.println("Harga           : " + harga);
    }
}
