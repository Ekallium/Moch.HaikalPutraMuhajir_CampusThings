package Snake;

public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake(5, 5);
        snake1.moveUp();
        snake1.printPosition();
        snake1.moveLeft();   
        snake1.printPosition();
        System.out.println("========================");
        Snake snake2 = new Snake(2, 3);
        snake2.moveRight();
        snake2.printPosition();
        snake2.moveDown();   
        snake2.printPosition();
    }
}
