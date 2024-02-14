import java.util.Scanner;

public class Kubus19 {
    static int HitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int HitungLuasPermukaan(int sisi) {
        int luasPermukaan = sisi * sisi * 6;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume, luasPermukaan, sisi;
        System.out.print("Masukkan sisi kubus  : ");
        sisi = sc.nextInt();
        System.out.println("======================================");
        volume = HitungVolume(sisi);
        System.out.println("Volume Kubus         = " + volume);
        luasPermukaan = HitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }
}