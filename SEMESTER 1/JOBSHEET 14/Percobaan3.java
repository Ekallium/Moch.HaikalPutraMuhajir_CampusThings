import java.util.Scanner;
public class Percobaan3{
    static double HitungLaba(double saldo, int tahun){
        if(tahun == 0) {
             return(saldo);
        } else {
            return (1.11 + HitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah Saldo Awal : ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya Investasi (tahun) : ");
        tahun = sc.nextInt();
        System.out.printf("Jumlah saldo setelah %d tahun : %.3f", tahun, HitungLaba(saldoAwal, tahun));
    }
}