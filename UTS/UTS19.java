import java.util.Scanner;

public class UTS19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa Yang Ingin Diinput : ");
        int siswa = input.nextInt();
        for (int i = 1; i <= siswa; i++) {
            System.out.println("\tSiswa ke-" + i);
            System.out.print("Masukkan Nilai Matematika       : ");
            double nilaiMat = input.nextDouble();
            System.out.print("Masukkan Nilai Fisika           : ");
            double nilaiFis = input.nextDouble();
            System.out.print("Masukkan Nilai Bahasa Inggris   : ");
            double nilaiBig = input.nextDouble();
            System.out.print("Masukkan Nilai Bahasa Indonesia : ");
            double nilaiBi = input.nextDouble();
            double avg = ((nilaiMat + nilaiFis + nilaiBig + nilaiBi) / 4);
            System.out.printf("Rata-Rata Mahasiswa baru tersebut adalah : %.2f %n", avg);
            input.nextLine();
            System.out.print("Masukkan Jurusan Anda (IPA / IPS / Bahasa) : ");
            String jurusan = input.next();
            if (jurusan.equalsIgnoreCase("Bahasa")) {
                String bahasa = (avg > 80 && nilaiMat >= 70 && nilaiBig >= 70 && nilaiBi >= 70)
                        ? "Anda Diterima Di Perguruan Tinggi Negeri Program Studi D3 MI"
                        : "Anda Tidak Diterima, Coba Lagi Lain Kali";
                System.out.println(bahasa);
            } else if (jurusan.equalsIgnoreCase("IPS")) {
                String ips = (avg >= 80 && nilaiMat >= 80)
                        ? "Anda Diterima Di Perguruan Tinggi Negeri Program Studi D4 TI"
                        : "Anda Tidak Diterima, Coba Lagi Lain Kali";
                System.out.println(ips);
            } else if (jurusan.equalsIgnoreCase("IPA")) {
                if (avg >= 80 && nilaiMat >= 80) {
                    System.out.println("Anda Diterima Di Perguruan Tinggi Negeri Program Studi D4 TI");
                } else
                    System.out.println("Anda Tidak Diterima Di Program Studi D4 TI, Coba Lagi Lain Kali");
                if (nilaiMat >= 70 && nilaiFis >= 70) {
                    System.out.println("Anda Diterima Di Perguruan Tinggi Negeri Program Studi D3 MI");
                } else
                    System.out.println("Anda Tidak Diterima Di Program Studi D3 MI, Coba Lagi Lain Kali");
            } else
                System.out.println("Masukkan Input Yang Valid !");
        }
    }
}