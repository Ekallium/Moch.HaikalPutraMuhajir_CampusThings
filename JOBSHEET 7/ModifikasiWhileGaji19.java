import java.util.Scanner;

public class ModifikasiWhileGaji19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();
        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan/Pegawai");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+i) + " : ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            scan.close();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan") || jabatan.equalsIgnoreCase("pegawai")){
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        } 
    }
}