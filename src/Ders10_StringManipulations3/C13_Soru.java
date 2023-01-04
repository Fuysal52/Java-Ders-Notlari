package Ders10_StringManipulations3;

import java.util.Scanner;

public class C13_Soru {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin
        // isim daha uzun ise, isim ve soy ismini ilk harf buyuk geri kalanlar kucuk harf seklinde yazdirin
        // soyisim daha uzun ise isim ilk harf buyuk gerisi kucuk, soy isim buyuk harf yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();


        if (isim.length() > soyIsim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +
                    soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));
        } else if (isim.length() <= soyIsim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +
                    soyIsim.toUpperCase());
        }
    }
}