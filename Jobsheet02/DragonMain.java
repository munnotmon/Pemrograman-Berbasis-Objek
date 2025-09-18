package Jobsheet02;

public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        dragon1.changeDirection(2); // arah kanan
        dragon1.move(5);
        dragon1.printStatus();

        Dragon dragon2 = new Dragon();
        dragon2.changeDirection(1); // arah atas
        dragon2.move(3);
        dragon2.printStatus();

        Dragon dragon3 = new Dragon();
        dragon3.move(2); // arah belum ditentukan
        dragon3.printStatus();
    }
}
