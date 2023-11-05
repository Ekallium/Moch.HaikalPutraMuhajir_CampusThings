import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        boolean online = true;
        while (online) {
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan Input : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama  : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris < 5 && kolom < 3) {
                        if (penonton[baris - 1][kolom - 1] == null || penonton[baris - 1][kolom - 1] == "***") {
                            penonton[baris - 1][kolom - 1] = nama;
                        } else {
                            System.out.println("Kursi Telah Terisi");
                            System.out.println("Masukkan Input Kembali !");
                        }
                    } else {
                        System.out.println(" Kursi tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                   for(int i = 0; i < penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                   }
                    break;
                case 3:
                    online = false;
                    break;
            }
        }
    }
}
