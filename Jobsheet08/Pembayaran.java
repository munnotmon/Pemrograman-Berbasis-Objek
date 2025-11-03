package Jobsheet08;

public abstract class Pembayaran {
    protected double jumlah;
    protected double biayaAdmin;

    public Pembayaran(double jumlah, double biayaAdmin) {
        this.jumlah = jumlah;
        this.biayaAdmin = biayaAdmin;
    }

    public void tampilkanInfo() {
        System.out.println("Jumlah Pembayaran: " + jumlah);
        System.out.println("Biaya Admin: " + biayaAdmin);
    }

    public abstract void prosesPembayaran();
}
