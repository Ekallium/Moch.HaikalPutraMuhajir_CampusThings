package Pyramid;

public class Pyramid {
    double panjangAlas;
    double tinggi;

    public Pyramid(double newPanjangAlas, double newTinggi) {
        panjangAlas = newPanjangAlas;
        tinggi = newTinggi;
    }

    double hitungLuasAlas() {
        double luasAlas = panjangAlas * panjangAlas;
        return luasAlas;
    }

    double hitungVolume() {
        double volumeAlas = hitungLuasAlas();
        double volume = (volumeAlas * tinggi) / 3;
        return volume;
    }

    void printLuasAlas() {
        System.out.println("Luas Alas Piramida tersebut : " + hitungLuasAlas());
    }

    void printVolume() {
        System.out.println("Volume Piramida tersebut    : " + hitungVolume());
    }
}
