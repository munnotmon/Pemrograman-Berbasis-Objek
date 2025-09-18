package Jobsheet03.Tugas;

public class Anggota {
  private String nomorKTP;
  private String nama;
  private int limitPinjaman;
  private int jumlahPinjaman;

  public Anggota(String nomorKTP, String nama, int limitPinjaman) {
      this.nomorKTP = nomorKTP;
      this.nama = nama;
      this.limitPinjaman = limitPinjaman;
      this.jumlahPinjaman = 0; 
  }

  public String getNomorKTP() {
      return nomorKTP;
  }

  public String getNama() {
      return nama;
  }

  public int getLimitPinjaman() {
      return limitPinjaman;
  }

  public int getJumlahPinjaman() {
      return jumlahPinjaman;
  }

  public void pinjam(int jumlah) {
      if (jumlahPinjaman + jumlah > limitPinjaman) {
          System.out.println("Jumlah pinjaman melebihi limit.");
      } else {
          jumlahPinjaman += jumlah;
      }
  }

  public void angsur(int jumlah) {
    int minimalAngsuran = (int)(jumlahPinjaman * 0.1); 
    if (jumlah < minimalAngsuran) {
        System.out.println("Angsuran harus 10% dari jumlah pinjaman");
    } else {
        jumlahPinjaman -= jumlah;
        if (jumlahPinjaman < 0) {
            jumlahPinjaman = 0; 
        }
    }
  }
}
