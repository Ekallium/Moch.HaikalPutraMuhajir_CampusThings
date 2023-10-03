import java.util.Scanner;

public class ModifikasiPemilihan2Percobaan219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan Sudut Pertama : ");
        int sudut1 = input19.nextInt();
        System.out.print("Masukkan Sudut Pertama : ");
        int sudut2 = input19.nextInt();
        System.out.print("Masukkan Sudut Pertama : ");
        int sudut3 = input19.nextInt();
        input19.close();
        int totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2 && sudut1 != sudut3) || (sudut1 == sudut3 && sudut1 != sudut2) || (sudut2 == sudut3 && sudut2 != sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) 
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
            System.out.println("Bukan Segitiga");
    }
}