package Ders10_StringManipulations3;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin asagidaki sartlari kontrol edip ve kullaniciya duzeltmesi gereken
        // tum eksikleri soyleyin
        // eger tum sartlar basariyla saglaniyorsa "sifre basariyla kaydedildi"yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();

        // Sonucta basarili sifre olusturldu demek icin bir kontrol mekanizmasi olusturmamiz gerekir
        // Ya her adimda artiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz veya basta verdigimiz deger
        // olumsuz bir durum oldugunda artirilir, en sonda kontrol edip eger bastaki degeri hala
        // koruyorsa basarili olmustur diyebilirz

        int flag=0;


        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }

        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("Son karakter rakam olmali");
            flag++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }

        if (!(sifre.length()>=10)) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }

        if (flag==0) {
            System.out.println("Sifreniz basariyla kaydedildi");
        }
   }
}

