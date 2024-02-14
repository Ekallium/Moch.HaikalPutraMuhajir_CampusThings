import java.util.Scanner;

public class Ucapan_19 {
    static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println(namaOrang);
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.printf("Thank you %s%nMay the force be wtih you", nama);
    }
}