import java.util.Scanner;
    public class Bank20{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int jml_tabungan_awal, lama_menabung;
            double persentase_bunga = 0.02, bunga, jml_tabungan_akhir;
            System.out.println("Masukkan Jumlah Tabungan Awal Anda");
            jml_tabungan_awal = input.nextInt();
            System.out.println("Masukkan Lama Menabung Anda");
            lama_menabung = input.nextInt();
            bunga = lama_menabung*persentase_bunga*jml_tabungan_awal;
            jml_tabungan_akhir=bunga+jml_tabungan_awal;
            System.out.print("Jumlah Tabungan Akhir Anda Adalah : Rp" + jml_tabungan_akhir);
            input.close();
        }
    }