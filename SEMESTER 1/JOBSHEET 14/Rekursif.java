import java.util.Scanner;

public class Rekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret Descending (Rekursif):");
        Urutkan(n);
    }

    static void Urutkan(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            Urutkan(n - 1);
        }
    }
}
