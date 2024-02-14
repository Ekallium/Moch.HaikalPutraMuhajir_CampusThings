public class ContohVariabel20{
    public static void main(String[] args){
        String namaPanjang = "Moch. Haikal Putra Muhajir";
        String salahDuaHobiSayaAdalah = "Olahhraga dan Tidur";
        int umurSayaSekarang = 18;
        char jenisKelamin = 'L';
        boolean isGanteng = true;
        double ipk = 4.00;
        float tinggiBadan = 1.61F, beratBadan = 54.6F;
        System.out.println("Nama          : " + namaPanjang);
        System.out.println("Umur          : " + umurSayaSekarang);
        System.out.println("Jenis Kelamin : "+ jenisKelamin);
        System.out.println(String.format("Tinggi Badan  : %sm", tinggiBadan));
        System.out.println(String.format("Berat Badan   : %sKg", beratBadan));
        System.out.println("IPK           : " + ipk);
        System.out.println("Hobi          : " + salahDuaHobiSayaAdalah);
        System.out.println("Ganteng kah?  : " + isGanteng);
        System.out.println(String.format("Saya BerIPK : %s, Tinggi Badan saya : %s", ipk, tinggiBadan ));


    }
}