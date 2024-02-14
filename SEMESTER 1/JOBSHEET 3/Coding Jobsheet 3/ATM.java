import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Saldo Anda : ");
        int saldo = scan.nextInt();
        System.out.print("Masukkan Jumlah Uang Anda : ");
        int uang = scan.nextInt();
        System.out.println("Saldo Anda Rp" + saldo + "\nUang Anda Rp" + uang);
        System.out.println("---------------------------------");
        System.out.println("  SELAMAT DATANG DI BANK JALI !");
        System.out.println("---------------------------------");
        boolean menu = true;
        while (menu) {
            System.out.println("\nPILIHAN MENU");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Saldo Anda: Rp" + saldo);
                    menu = false;
                    break;
                case 2:
                    System.out.print("Jumlah uang yang ingin anda tarik\nRp");
                    int tarik = scan.nextInt();
                    if (tarik > saldo - 49999) {
                        System.out.println("Saldo anda tidak mencukupi untuk transaksi ini");
                    } else if (tarik % 50000 != 0) {
                        System.out.println("Penarikan tunai harus kelipatan Rp50.000");
                    } else {
                        saldo = saldo - tarik;
                        uang = uang + tarik;
                        System.out.println("Penarikan Tunai berhasil\nSisa saldo anda : Rp" + saldo
                                + "\nSisa uang anda : Rp" + uang);
                    }
                    menu = false;
                    break;
                case 3:
                    System.out.print("Jumlah uang yang ingin anda setorkan\nRp");
                    int setor = scan.nextInt();
                    if (setor > uang) {
                        System.out.println("Uang anda tidak mencukupi untuk transaksi ini");
                    } else if (setor < 50000) {
                        System.out.println("Penyetoran tunai minimal Rp50.000");
                    } else if (setor % 50000 != 0) {
                        System.out.println("Setor tunai harus kelipatan Rp50.000");
                    } else {
                        saldo = saldo + setor;
                        uang = uang - setor;
                        System.out.println("Penarikan Tunai berhasil\nSisa saldo anda : Rp" + saldo
                                + "\nSisa uang anda : Rp" + uang);
                    }
                    menu = false;
                    break;
                case 4:
                    System.out.println("Terimakasih Telah menggunakan Bank Jali");
                    System.exit(0);
                default:
                    System.out.println("Masukkan angka yang terdapat pada pilihan.");
            }
            while (!menu) {
                System.out.print("\nApakah Anda ingin melakukan transaksi lain (Y/T): ");
                char exit = scan.next().charAt(0);
                if (exit == 't' || exit == 'T') {
                    System.out.println("Terimakasih Telah menggunakan Bank Jali");
                    System.exit(0);
                } else if (exit == 'y' || exit == 'Y') {
                    menu = true;
                } else {
                    System.out.println("Ketik 'Y' untuk ya atau 'T' untuk tidak.");
                }
            }
        }
        scan.close();
    }

}
