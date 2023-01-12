package Ders12_MethodOlusturmaVeKullanma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen iki sayiyi carpim sonucu yazdiran bir method olusturun

        carpYazdir(5,8);
        carpYazdir(7.4,4.5); // method double double oldugu icin argument double olmalidir
    }
    public static void carpYazdir (double sayi1, double sayi2) {

        System.out.println(sayi1*sayi2);
    }
}
