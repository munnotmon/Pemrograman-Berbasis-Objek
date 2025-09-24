package Jobsheet04.Restoran;

public class Menu {
    private String idMenu;
    private String nama;
    private double harga;
    private boolean tersedia;

    public Menu(String idMenu, String nama, double harga, boolean tersedia) {
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
        this.tersedia = tersedia;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public void tampilInfoMenu() {
        System.out.println("ID Menu : " + idMenu);
        System.out.println("Nama    : " + nama);
        System.out.println("Harga   : Rp" + harga);
        System.out.println("Status  : " + (tersedia ? "Tersedia" : "Habis"));
    }
}
