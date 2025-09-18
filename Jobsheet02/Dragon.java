package Jobsheet02;

public class Dragon {
    int x;
    int y;
    int direction; 

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! (Hanya 1-4)");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // atas
                y += steps;
                break;
            case 2: // kanan
                x += steps;
                break;
            case 3: // bawah
                y -= steps;
                break;
            case 4: // kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah belum ditentukan! Dragon tidak bergerak.");
        }
    }

    public void printStatus() {
        String arah = "";
        switch (direction) {
            case 1: arah = "Atas"; break;
            case 2: arah = "Kanan"; break;
            case 3: arah = "Bawah"; break;
            case 4: arah = "Kiri"; break;
            default: arah = "Tidak Diketahui";
        }
        System.out.println("Posisi: (" + x + ", " + y + ")");
        System.out.println("Arah: " + arah);
        System.out.println("=======================");
    }
}

