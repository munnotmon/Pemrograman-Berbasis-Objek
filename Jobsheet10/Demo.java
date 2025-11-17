package Jobsheet10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // 1. Deklarasi objek Dosen dan TenagaKependidikan
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Pegawai pegawai1 = dosen1;
            System.out.println(dosen1.nip);
            System.out.println(dosen1.nama);
            pegawai1.displayInfo();

        Dosen newDosen = (Dosen) pegawai1;
            System.out.println(newDosen.nama);
            System.out.println(newDosen.nidn);
            newDosen.mengajar();

        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // 2. Deklarasi dan inisialisasi ArrayList
        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();

        // 3. Menambahkan objek ke ArrayList
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        // 4. Mencetak jumlah elemen dalam ArrayList
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }
}