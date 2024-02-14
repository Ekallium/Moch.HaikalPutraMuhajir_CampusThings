import java.util.Scanner;
    public class HargaBayar20{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int harga, jumlah;
            double dis , total, bayar, jmlDis;
            System.out.print("Masukkan harga barang yang dibeli : ");
            harga = input.nextInt();
            System.out.print("Masukkan jumlah barang yang dibeli : ");
            jumlah = input.nextInt();
            System.out.print("Masukkan diskon pada barang yang dieli : ");
            dis = input.nextDouble();
            total = harga * jumlah;
            jmlDis = total * dis;
            bayar = total - jmlDis;
            System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
            System.out.println("Jumlah yang harus dibayar adalah : " + bayar);
        }
    }