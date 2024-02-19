package Dragon;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(5, 5, 1);
        dragon1.move(2);
        dragon1.printStatus();
        Dragon dragon2 = new Dragon(10, 10, 3);
        dragon2.move(1);
        dragon2.printStatus();
    }
}
