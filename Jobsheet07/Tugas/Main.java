package Jobsheet07.Tugas;

public class Main {
    public static void main(String[] args) {
        TiketKereta tk1 = new TiketKereta("K001", "Maulida Aprina", "Malang", "Surabaya",
                                          150000, "Eksekutif", "Gajayana", "A12");
        tk1.displayInfo();

        TiketPesawat tp1 = new TiketPesawat("P001", "Maulida Aprina", "Jakarta", "Bali",
                                            1200000, "Garuda Indonesia", "Bisnis", "GA100");
        tp1.displayInfo();
    }
}
