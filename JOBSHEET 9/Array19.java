import java.util.Scanner;
public class Array19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukkan Jumlah Siswa : ");
        int jmlElemen = sc.nextInt();
        int[] nilai = new int[jmlElemen];
        int nilaiTinggi = 0;
        int nilaiRendah = 2147483647;
        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan IQ Siswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > nilaiTinggi){
                nilaiTinggi = nilai[i];
            } 
            if (nilai[i] < nilaiRendah){
                nilaiRendah = nilai[i];
            }
        }
        int avg = total / jmlElemen;
        System.out.println("IQ Tertinggi Adalah       : " + nilaiTinggi);
        System.out.println("IQ Terendah Adalah        : " + nilaiRendah);
        System.out.println("Rata-Rata IQ Siswa Adalah : " + avg);
    }
}