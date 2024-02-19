package Dragon;

class Dragon {
    int x;
    int y;
    int direction;

    Dragon(int newX, int newY, int newDirection) {
        x = newX;
        y = newY;
        direction = newDirection;
    }

    void changeDirection(int newDirection) {
        direction = newDirection;
    }

    void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;

            default:
            System.out.println("Direction Tidak Valid ! (1 - 4)");
                break;
        }
    }

    void printStatus() {
        String StringArah = null;
        switch (direction) {
            case 1:
                StringArah = "Atas";
                break;
            case 2:
                StringArah = "Kanan";
                break;
            case 3:
                StringArah = "Bawah";
                break;
            case 4:
                StringArah = "Kiri";
                break;

            default:
                break;
        }

        System.out.printf("Koordinat :   (%d,%d)%n", x, y);
        System.out.printf("Arah      : %d (%s)%n", direction, StringArah);
    }

}
