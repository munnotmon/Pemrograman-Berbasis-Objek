package Jobsheet04.Restoran;

import java.util.ArrayList;

public class Pemesanan {
    private Pelanggan pelanggan;
    private ArrayList<Menu> daftarPesanan;
    private double totalHarga;

    public Pemesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.daftarPesanan = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public void tambahPesanan(Menu menu) {
        if (menu.isTersedia()) {
            daftarPesanan.add(menu);
            System.out.println(menu.getNama() + " berhasil ditambahkan ke pesanan.");
        } else {
            System.out.println("Menu " + menu.getNama() + " sedang tidak tersedia.");
        }
    }

    public void hapusPesanan(Menu menu) {
        if (daftarPesanan.remove(menu)) {
            System.out.println(menu.getNama() + " berhasil dihapus dari pesanan.");
        } else {
            System.out.println(menu.getNama() + " tidak ada di pesanan.");
        }
    }

    public double hitungTotalHarga() {
        totalHarga = 0.0;
        for (Menu m : daftarPesanan) {
            totalHarga += m.getHarga();
        }
        return totalHarga;
    }

    public void tampilDetailPemesanan() {
        System.out.println("\n=== Detail Pemesanan ===");
        pelanggan.tampilInfoPelanggan();
        System.out.println("\nPesanan      :");
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
        } else {
            for (Menu m : daftarPesanan) {
                System.out.println("- " + m.getNama() + " (Rp" + m.getHarga() + ")");
            }
            System.out.println("Total Harga: Rp" + hitungTotalHarga());
        }
        System.out.println("========================\n");
    }
}
