
//Import Library Scanner
import java.util.Scanner;

//Inisialisasi Class
public class SegitigaAngka {
    // Inisialisasi Main Method
    public static void main(String[] args) {
        // Inisialisasi Scanner
        Scanner sc = new Scanner(System.in);
        // Input Tinggi Segitiga
        System.out.print("Masukkan Tinggi Segitiga : ");
        int n = sc.nextInt();
        // Outer loop untuk menentukan tinggi segitiga
        for (int i = 1; i <= n; i++) {
            // Inner loop 1 untuk print spasi sebanyak j - 1
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Inner loop 2 untuk print angka sebanyak k
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Pergi ke baris selanjutnya ketika semua inner loop telah terlaksana
            System.out.println();
        }
    }
}