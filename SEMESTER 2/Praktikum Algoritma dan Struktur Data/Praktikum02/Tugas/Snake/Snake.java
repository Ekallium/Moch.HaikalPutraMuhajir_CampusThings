package Snake;

class Snake {
    int x;
    int y;

    Snake(int newX, int newY) {
        x = newX;
        y = newY;
    }

    void moveLeft() {
        x -= 1;
    }

    void moveRight() {
        x += 1;
    }

    void moveUp() {
        y += 1;
    }

    void moveDown() {
        y -= 1;
    }

    void printPosition() {
        System.out.println("x : " + x + " Y : " + y);
    }

}
