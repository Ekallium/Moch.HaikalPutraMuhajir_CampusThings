public class TerimaKasih_19 {
    static void UcapanTerimakasih() {
        System.out.println("Thank You for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        ucapanTambahan(ucapan);
    }
}