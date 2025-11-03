package Jobsheet08;

public class Main {
    public static void main(String[] args) {
        TransferBank transfer = new TransferBank(500000, 5000, "1234567890");
        EWallet ewallet = new EWallet(250000, 2500, "081234567890");

        System.out.println("=== Pembayaran via Transfer Bank ===");
        transfer.tampilkanInfo();
        transfer.prosesPembayaran();

        System.out.println("\n=== Pembayaran via E-Wallet ===");
        ewallet.tampilkanInfo();
        ewallet.prosesPembayaran();
    }
}
