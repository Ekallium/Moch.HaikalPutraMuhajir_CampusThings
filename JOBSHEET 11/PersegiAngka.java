
//Import Library Scanner
import java.util.Scanner;

//Inisialisasi Class
public class PersegiAngka {
    // Inisialisasi Main Method
    public static void main(String[] args) {
        // Inisialisasi Scanner
        Scanner sc = new Scanner(System.in);
        // Input panjang sisi persegi
        System.out.print("Masukkan Panjang Sisi Persegi : ");
        int n = sc.nextInt();
        // Outer loop untuk menentukan tinggi persegi
        for (int i = 1; i <= n; i++) {
            // Pemilihan dengan kondisi bila outer loop berjalan pada baris pertama dan
            // terakhir
            if (i == 1 || i == n) {
                // Inner loop untuk print n sejumlah n
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d ", n);
                }
                // Setelah semua iterasi inner loop terlaksana maka akan pergi ke baris selanjutnya
                System.out.println();
                // Pemilihan dengan kondisi bila outer loop berjalan di luar baris pertama dan terakhir
            } else {
                // Inner loop untuk print n dan spasi di luar baris pertama dan akhir
                for (int k = 1; k <= n; k++) {
                    if (k == 1 || k == n) {
                        // print n diawal dan akhir kolom
                        System.out.printf("%d ", n);
                    } else if (n < 10) {
                        // print spasi sejumlah 2 bila jumlah n 1 digit
                        System.out.print("  ");
                    } else
                        // print spasi sejumlah 3 bila jumlah n 2 digit
                        System.out.print("   ");
                }
                // setelah semua iterasi inner loop terlaksana maka akan pergi ke baris selanjutnya
                System.out.println();
            }
        }
    }
}