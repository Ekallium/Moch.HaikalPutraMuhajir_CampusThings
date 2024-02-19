class Sepeda {
    float kecepatan;
    int gear;
    public Sepeda(){
        
    }
    
    public Sepeda(float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }

    void tambahKecepatan(int increment) {
        if ((kecepatan += increment) > 20)
        System.out.println("Kecepatan Maksimum Adalah 20");
        else {
            kecepatan += increment; 
        }
        kecepatan -= increment;
    }

    void kurangiKecepatan(int decrement) {
        if ((kecepatan -= decrement) < 0){
            System.out.println("Kecepatan Minimum Adalah 0 !");
        } else {
            kecepatan -= decrement;
        }
        kecepatan += decrement;
    }

    void cetakInfo() {
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear      : " + gear);
        System.out.println("=======================");
    }
}