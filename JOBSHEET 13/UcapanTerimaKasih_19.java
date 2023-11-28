import java.util.Scanner;

public class UcapanTerimaKasih_19 {

    static Scanner sc = new Scanner(System.in);
    static String namaOrang = "Budi";

    public static void main(String[] args) {
        PenerimaUcapan();
        System.out.printf("Masukkan Ucapan Tambahan Untuk %s : ", namaOrang);
        String tambahan = sc.nextLine();
        UcapanTerimaKasih();
        ucapanTambahan(tambahan);
    }

    static String PenerimaUcapan() {
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        namaOrang = sc.nextLine();
        return namaOrang;
    }

    static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
        sc.close();
    }

    static void UcapanTerimaKasih() {
        System.out.println("========================================OUTPUT========================================");
        String nama = namaOrang;
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");

    }
}