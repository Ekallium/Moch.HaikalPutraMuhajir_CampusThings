import java.util.Scanner;
public class CekPrimaRekursif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        if (Prima(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    static boolean Prima(int n, int pembagi) {
        if (n <= 1) {
            return false;
        } else if (pembagi == 1) {
            return true;
        } else {
            if (n % pembagi == 0) {
                return false;
            } else {
                return Prima(n, pembagi - 1);
            }
        }
    }

    static boolean Prima(int n) {
        return Prima(n, n - 1);
    }
}