package Jobsheet07.Tugas;

public class Main {
    public static void main(String[] args) {
        // Objek pertama: Tiket Kereta
        TiketKereta tk1 = new TiketKereta("K001", "Maulida Aprina", "Malang", "Surabaya",
                                          150000, "Eksekutif", "Gajayana", "A12");
        tk1.displayInfo();

        // Objek kedua: Tiket Pesawat
        TiketPesawat tp1 = new TiketPesawat("P001", "Maulida Aprina", "Jakarta", "Bali",
                                            1200000, "Garuda Indonesia", "Bisnis", "GA100");
        tp1.displayInfo();
    }
}
