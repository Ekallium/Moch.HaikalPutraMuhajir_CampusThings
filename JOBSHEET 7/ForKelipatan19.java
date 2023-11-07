import java.util.Scanner;

public class ForKelipatan19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah, counter, kelipatan;
        jumlah = 0;
        counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya kelipatan bilangan %d dari 1 - 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 - 50 adalah %d\n", kelipatan, jumlah);

    }
}