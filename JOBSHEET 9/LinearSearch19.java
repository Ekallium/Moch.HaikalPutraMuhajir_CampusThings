import java.util.Scanner;

public class LinearSearch19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Elemen Array   : ");
        int jmlArray = sc.nextInt();
        int[] arrayInt = new int[jmlArray];
        int hasil = -1;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan Elemen Array ke-" + (i) + "     : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan Key Yang Ingin Dicari : ");
        int key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1){
            System.out.println("Key Tidak Ditemukan");
        } else
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
    }
}