import java.util.Scanner;

public class ModifikasiPemilihanPercobaan2_20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        String nilaiAbjad = "F";
        System.out.print("Nilai UAS   :  ");
        float uas = input20.nextFloat();
        System.out.print("Nilai UTS   :  ");
        float uts = input20.nextFloat();
        System.out.print("Nilai Kuis  :  ");
        float kuis = input20.nextFloat();
        System.out.print("Nilai Tugas :  ");
        float tugas = input20.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80 && total <= 100) {
            nilaiAbjad = "A";
        } else if (total > 73 && total <= 80) {
            nilaiAbjad = "B+";
        } else if (total > 65 && total <= 73) {
            nilaiAbjad = "B";
        } else if (total > 60 && total <= 65) {
            nilaiAbjad = "C+";
        } else if (total > 50 && total <= 60) {
            nilaiAbjad = "C";
        } else if (total > 39 && total <= 50) {
            nilaiAbjad = "D";
        } else if (total <= 39 && total < 0)  {
            nilaiAbjad = "E";
        } else {
            System.out.println("Masukkan Nilai Yang Sesuai !");
        }
        String message = total <= 65 ? "Remidi" : "Tidak Remidi";
        if (total > 100) {
            message = "Nilai Tidak Valid";
        }
        System.out.println("Nilai Akhir = " + total + " Dengan Kredikat " + nilaiAbjad + " Sehingga " + message);
    }
}
