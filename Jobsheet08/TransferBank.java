package Jobsheet08;

public class TransferBank extends Pembayaran {
    private String noRek;

    public TransferBank(double jumlah, double biayaAdmin, String noRek) {
        super(jumlah, biayaAdmin);
        this.noRek = noRek;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran melalui Transfer Bank ke rekening: " + noRek);
        System.out.println("Total dibayar: " + (jumlah + biayaAdmin));
    }
}
