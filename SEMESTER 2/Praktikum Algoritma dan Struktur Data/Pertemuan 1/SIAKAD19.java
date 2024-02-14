import java.util.Scanner;

public class SIAKAD19 {
    public static void main(String[] args) {

        // Deklarasi

        Scanner sc = new Scanner(System.in);
        double[][] nilai = new double[9][2];
        String[] nilaiHuruf = new String[9];
        String[] matkul = { "Agama", "Bahasa Indonesia", "Critical Thingking and Problem Solving", "Dasar Pemrograman",
                "Konsep Teknologi Informasi",
                "Matematika Dasar", "Pengantar Akuntansi", "Praktikum Dasar Pemrograman", "Bahasa Inggris Dasar" };
        double counter = 0;

        // Input Nilai
        System.out.println(
                "==============================================================================================");
        System.out.println(
                "                                PROGRAM MENGHITUNG IP SEMESTER                                ");
        System.out.println(
                "==============================================================================================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan Nilai Angka Untuk Mata Kuliah %-40s : ", matkul[i]);
            nilai[i][0] = sc.nextFloat();
            nilaiHuruf[i] = NilaiHuruf(nilai[i][0]);
            nilai[i][1] = NilaiSetara(nilaiHuruf[i]);
            if(i == 7){
                counter += (nilai[i][1] * 3);
            } else {
                counter += (nilai[i][1] * 2);
            }
        }

        // Hasil Koversi Nilai

        System.out.println(
                "==============================================================================================");
        System.out.println(
                "                                     HASIL KONVERSI NILAI                                     ");
        System.out.println(
                "==============================================================================================");
        System.out.printf("%-40s%-15s%-15s%-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println(
                "----------------------------------------------------------------------------------------------");
        for(int i = 0; i < matkul.length; i++){
            System.out.printf("%-44s%-16s%-14s%-15s%n", matkul[i], nilai[i][0], nilaiHuruf[i], nilai[i][1]);
        }
        System.out.println(
                "==============================================================================================");
        System.out.printf("IP : %.2f", (counter / 19));
    }

    // Function
    static String NilaiHuruf(double a) {
        String huruf = "";
        if (a >= 80 && a <= 100) {
            huruf = "A";
        } else if (a >= 73 && a < 80) {
            huruf = "B+";
        } else if (a >= 65 && a < 73) {
            huruf = "B";
        } else if (a >= 60 && a < 65) {
            huruf = "C+";
        } else if (a >= 50 && a < 60) {
            huruf = "C";
        } else if (a >= 39 && a < 50) {
            huruf = "D";
        } else if (a < 39) {
            huruf = "E";
        } else {
            huruf = null;
        }
        return huruf;
    }
    
    static double NilaiSetara(String a) {
        double nilaisetara = 0;
        switch (a) {
            case "A":
                nilaisetara = 4;
                break;
            case "B+":
                nilaisetara = 3.5;
                break;
            case "B":
                nilaisetara = 3;
                break;
            case "C+":
                nilaisetara = 2.5;
                break;
            case "C":
                nilaisetara = 2;
                break;
            case "D":
                nilaisetara = 1;
                break;
            case "E":
                nilaisetara = 0;
                break;

            default:
                break;
        }
        return nilaisetara;
    }
}