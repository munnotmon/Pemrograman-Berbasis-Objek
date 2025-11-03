package Jobsheet07.Tugas;

public class TiketPesawat extends Tiket {
    private String maskapai;
    private String kelasPenerbangan;
    private String nomorPenerbangan;

    public TiketPesawat() {
        super(); 
        System.out.println("Objek TiketPesawat dibuat (tanpa parameter)");
    }

    public TiketPesawat(String idTiket, String namaPenumpang, String asal, String tujuan,
                        double harga, String maskapai, String kelasPenerbangan, String nomorPenerbangan) {
        super(idTiket, namaPenumpang, asal, tujuan, harga); 
        this.maskapai = maskapai;
        this.kelasPenerbangan = kelasPenerbangan;
        this.nomorPenerbangan = nomorPenerbangan;
        System.out.println("Objek TiketPesawat dibuat (dengan parameter)");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maskapai        : " + maskapai);
        System.out.println("Kelas Terbang   : " + kelasPenerbangan);
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("------------------------------------");
    }
}
