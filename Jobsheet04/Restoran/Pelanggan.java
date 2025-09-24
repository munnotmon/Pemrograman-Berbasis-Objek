package Jobsheet04.Restoran;

public class Pelanggan {
    private String idPelanggan;
    private String nama;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilInfoPelanggan() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
    }
}
