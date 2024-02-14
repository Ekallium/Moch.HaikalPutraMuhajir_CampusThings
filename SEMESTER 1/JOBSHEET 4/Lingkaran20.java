import java.util.Scanner;
    public class Lingkaran20 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int r;
            double keliling, luas;
            System.out.print("Masukkan jari-jari lingkaran : ");
            r = input.nextInt();
            input.close();
            keliling = 2 * 3.14 * r;
            luas = 3.14 * r * r;
            System.out.println("Keliling : " + keliling);
            System.out.println("Luas     : " + luas);
        }
    }