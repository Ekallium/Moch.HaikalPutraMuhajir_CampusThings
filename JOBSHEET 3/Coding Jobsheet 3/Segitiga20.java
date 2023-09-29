import java.util.Scanner;
public class Segitiga20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Alas Segitiga anda: ");
        int alas = scan.nextInt();
        System.out.print("Tinggi Segitiga Anda : ");
        int tinggi = scan.nextInt();
        double luas = alas * tinggi/2;
        System.out.println("Luas Segitiga Anda Adalah = " + luas);

        
    }
}