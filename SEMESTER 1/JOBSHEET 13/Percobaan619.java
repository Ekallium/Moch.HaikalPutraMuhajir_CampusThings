import java.util.Scanner;
public class Percobaan619{
    static int HitungLuas (int p, int l){
        int L = p * l;
        return L;
    }
    static int HitungVolume (int t, int p, int l){
        int vol = HitungLuas(p, l) * t;
        return vol;
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan Panjang  : ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar    : ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi   : ");
        t = input.nextInt();
        System.out.println("======================================");
        L = HitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah = " + L);
        vol = HitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah         = " + vol);
    }
}