import java.util.Scanner;

public class JumlahRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasil = Jumlah(n);
        System.out.println("Penjumlahan dari 1 sampai " + n + " = " + hasil);
    }

    static int Jumlah(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Jumlah(n - 1);
        }
    }
}
