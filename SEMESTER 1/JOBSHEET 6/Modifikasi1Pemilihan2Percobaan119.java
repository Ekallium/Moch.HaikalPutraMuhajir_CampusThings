import java.util.Scanner;

public class Modifikasi1Pemilihan2Percobaan119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        int tahun = input19.nextInt();
        input19.close();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else
                System.out.println("Bukan Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");

    }
}
