package Jobsheet04.RumahSakit;

import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // tambah data konsultasi
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasiBaru = new Konsultasi();
        konsultasiBaru.setTanggal(tanggal);
        konsultasiBaru.setDokter(dokter);
        konsultasiBaru.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasiBaru);
    }

    public String getInfo() {
        String info = "";
        info += "\nNo Rekam Medis       : " + this.noRekamMedis + "\n";
        info += "Nama                 : " + this.nama + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi   :\n";
            for (Konsultasi k : riwayatKonsultasi) {
                info += k.getInfo() + "\n";
            }
        } else {
            info += "Belum ada riwayat konsultasi\n";
        }

        info += "\n";
        return info;
    }
}
