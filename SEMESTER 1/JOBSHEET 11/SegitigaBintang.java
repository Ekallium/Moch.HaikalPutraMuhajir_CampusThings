
//Import Library Scanner
import java.util.Scanner;

//Inisialisasi Class
public class SegitigaBintang {
    // Inisialisasi Main Method
    public static void main(String[] args) {
        // Inisialisasi Scanner
        Scanner sc = new Scanner(System.in);
        // Input Tinggi Segitiga
        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();
        // Outer loop untuk menentukan tinggi segitiga
        for (int i = n; i > 0; i--) {
            // Inner loop untuk print bintang sebanyak j
            for (int j = i; j > 0; j--) {
                System.out.print("*");
                // j - 1
            }
            // setelah inner loop selesai maka akan pergi ke baris selanjutnya dan mengulang outer loop
            System.out.println();
        }
    }
}