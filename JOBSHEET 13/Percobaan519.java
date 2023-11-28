public class Percobaan519 {
    static void Tampil(String str, int... a) {
        System.out.println("String : " + str);
        System.out.println("Jumlah Argumen / Parameter : " + a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    static void printData(String str, int[] numbers, String... strings) {
    }

    public static void main(String[] args) {
        printData("Data:", new int[] { 1, 2, 3 }, "a", "b", "c");
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }
}
