public class Marmut {
    public static void main(String[] args) {
        int jumlahMarmut = JumlahMarmut(12);
        
        System.out.println("Jumlah pasangan marmut pada bulan ke-12 adalah: " + jumlahMarmut);
    }

    static int JumlahMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return JumlahMarmut(bulan - 1) + JumlahMarmut(bulan - 2);
        }
    }
}
