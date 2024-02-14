import java.util.Scanner;

public class InputNilai19 {
    static String[] mahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static Scanner sc = new Scanner(System.in);
    static int top = 0;
    static int[][] tabelNilai = new int[5][7];

    static void InputNilai() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nama Mahasiswa : " + mahasiswa[i]);
            for (int j = 1; j <= 7; j++) {
                System.out.printf("Masukkan Nilai Mahasiswa Pada Minggu Ke-%d: ", j);
                int nilai = sc.nextInt();
                tabelNilai[i][j - 1] = nilai;
                NilaiTertinggi(nilai);
            }
        }
        PrintNilai();
    }

    static void NilaiTertinggi(int nilai) {
        if (top < nilai) {
            top = nilai;
        }
    }

    static void PrintNilai() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\t\tNilai " + mahasiswa[i]);
            System.out.println("=================================================================");
            for (int j = 1; j <= 7; j++) {
                System.out.println("Nilai Mahasiswa Pada Minggu Ke-" + j + " : " + tabelNilai[i][j - 1]);
            }
            System.out.println();
        }
    }

    static int NamaMahasiswa() {
        int index = -1;
        int maxNilai = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                int nilai = tabelNilai[i][j];
                if (nilai > maxNilai) {
                    maxNilai = nilai;
                    index = i;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        InputNilai();
        int bestStudentIndex = NamaMahasiswa();

        if (bestStudentIndex != -1) {
            System.out.println("Mahasiswa dengan nilai tertinggi: " + mahasiswa[bestStudentIndex]);
        } else {
            System.out.println("Tidak ada data nilai.");
        }

        System.out.println("Nilai Tertinggi: " + top);
    }
}
