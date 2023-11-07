import java.util.Scanner;
public class NestedLoop_2341760138{
    public static void main(String[] args) {
        double[][] temps = new double[5][7]; 
        double[] avg = new double[5];
        double total = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < temps.length; i++){
            System.out.println("Kota ke-" + (i+1));
            for(int j = 0; j < temps[0].length; j++){
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();
                total += temps[i][j];
            }
            avg[i] = total / 7; 
            System.out.println();
        }
        for(int i = 0; i < temps.length; i++){
            System.out.println("Kota ke-" + (i+1) + " : ");
            for(double suhu : temps[i]){
                System.out.print(suhu + " ");
            }
            System.out.println();
            System.out.printf("Rata - Rata : %.2f", avg[i]);
        }

    }
}