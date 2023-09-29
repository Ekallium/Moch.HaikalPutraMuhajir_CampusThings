import java.util.Scanner;
    public class Gaji20{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int jmlMasuk, jmlTdkMasuk, totGaji;
            int gaji = 400000, potGaji = 25000;
            System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
            jmlMasuk = input.nextInt();
            System.out.print("\nMasukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
            jmlTdkMasuk = input.nextInt();
            totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
            System.out.println("Gaji yang anda terima adalah : " + totGaji);
            input.close();
        }
    }