package Jobsheet04.Restoran;

public class RestoranDemo {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("P001", "Muna");
        Menu m1 = new Menu("M01", "Nasi Goreng", 20000, true);
        Menu m2 = new Menu("M02", "Ayam Bakar", 25000, true);
        Menu m3 = new Menu("M03", "Es Teh", 5000, false);

        Pemesanan pesanan1 = new Pemesanan(p1);

        pesanan1.tambahPesanan(m1);
        pesanan1.tambahPesanan(m2);
        pesanan1.tambahPesanan(m3); // harus gagal karena habis

        pesanan1.tampilDetailPemesanan();

        pesanan1.hapusPesanan(m2);
        pesanan1.tampilDetailPemesanan();
    }
}
