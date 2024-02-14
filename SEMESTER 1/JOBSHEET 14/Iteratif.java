import java.util.Scanner;

public class Iteratif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Deret Descending (Iteratif):");
        Hitung(n);
    }

    static void Hitung(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
