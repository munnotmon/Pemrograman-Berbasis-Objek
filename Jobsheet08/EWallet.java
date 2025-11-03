package Jobsheet08;

public class EWallet extends Pembayaran {
    private String noHP;

    public EWallet(double jumlah, double biayaAdmin, String noHP) {
        super(jumlah, biayaAdmin);
        this.noHP = noHP;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran melalui E-Wallet dengan nomor HP: " + noHP);
        System.out.println("Total dibayar: " + (jumlah + biayaAdmin));
    }
}
