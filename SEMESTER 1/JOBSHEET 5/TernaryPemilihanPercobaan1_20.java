import java.util.Scanner;
public class TernaryPemilihanPercobaan1_20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input20.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan genap";
        System.out.println(hasil);
    }
}