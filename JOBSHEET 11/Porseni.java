import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tempat Penyimpanan Untuk Nama Atlet
        String[][] atlet = new String[4][5];
        // Keterangan Cabang Olahraga
        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };

        //  Loop Terluar Untuk Menentukan Cabor Mana Yang Ingin Diinputkan Nama
        for (int i = 0; i < atlet.length; i++) {
            // Print Nama Cabang Olahraga
            System.out.println("\tCabang Olahraga " + cabor[i]);
            // Loop Untuk Menyimpan Nama Atlet Pada Array
            for (int j = 0; j < atlet[0].length; j++) {
                System.out.print("Masukkan Nama Atlet : ");
                String nama = sc.nextLine();
                // Menyimpan Data Atlet
                atlet[i][j] = nama;
            }
            // Satu Baris Telah Terisi Nama
            // Sorting Nama Secara Manual Menggunakan For Loop
            for (int k = 0; k < atlet[i].length - 1; k++) { // Nama Atlet 1
                for (int l = k + 1; l < atlet[i].length; l++) { // Nama Atlet 2
                    // Loop Disini Berfungsi Untuk Mengecek Karakter Pada Nama Satu Persatu
                    // Math Min Berfungsi Untuk Menggunakan Nilai Maksimal Iterasi Pada Nama Denagn Karakter Tersedikit Untuk Menghindari Index Out Of Bound
                    for (int m = 0; m < Math.min(atlet[i][k].length(), atlet[i][l].length()); m++) {
                        if ((int) atlet[i][l].charAt(m) < (int) atlet[i][k].charAt(m)) {
                            // Menukar Letak Nama Atlet
                            String temp = atlet[i][k]; // Menyimpan Data Sementara Untuk Ditukar
                            atlet[i][k] = atlet[i][l];
                            atlet[i][l] = temp;
                            break; // Keluar Dari Iterasi Setelah Menukar Susunan
                        } else if ((int) atlet[i][l].charAt(m) > (int) atlet[i][k].charAt(m)) {
                            // Jika Sudah Dalam Susunan Yang Tepat Maka Akan Keluar Dari Iterasi
                            break;
                        }
                    }
                }
            }
        }
        // Loop Untuk Setiap Cabang Olahraga
        for (int i = 0; i < atlet.length; i++) {
            // Print Cabor
            System.out.println("******************************************************");
            System.out.println("\tDaftar Atlet Cabang Olahraga " + cabor[i]);
            System.out.println("******************************************************");
            // For Each Loop Untuk Menampilkan Data Pada Satu Baris
            for (String daftar : atlet[i]) {
                // Print Atlet Dalam Satu Baris
                System.out.println(daftar);
            }
        }
    }
}
