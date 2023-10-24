import java.util.Scanner;

public class ArrayRataNilai19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTdkLulus= 0;
        int lulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) +" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs [i] > 70){
                totalLulus += nilaiMhs[i];
                lulus++;
            } else
            totalTdkLulus += nilaiMhs[i];
        } 
        System.out.println("Rata-Rata Nilai Lulus = " + totalLulus / lulus);
        System.out.println("Rata-Rata Nilai Tidak Lulus = " + totalTdkLulus / ( nilaiMhs.length - lulus ));
    } 
}