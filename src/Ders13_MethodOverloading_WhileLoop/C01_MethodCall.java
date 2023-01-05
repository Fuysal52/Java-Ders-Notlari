package Ders13_MethodOverloading_WhileLoop;

import Ders12_MethodOlusturmaVeKullanma.C04_AsalSayi;
import Ders12_MethodOlusturmaVeKullanma.C08_TerseCevirme;
import Ders12_MethodOlusturmaVeKullanma.C09_Palindrome;
import Ders12_MethodOlusturmaVeKullanma.C10_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        // ilk 15 fibonacci sayisini yazdirin

        C10_FibonacciSerisi.fibonaccidenSayiYazdir(15);

        // asagida verilen cumleyi tersine cevirin.

        String str = "Bir kere yaparim, yan gelir yatarim";

        String tersStr = C08_TerseCevirme.metniTerseCevir(str);

        // Asagidaki cumlenin palindroem olup olmadigini yazdirin


        str = "Java Candir";
        System.out.println("");

        tersStr = C08_TerseCevirme.metniTerseCevir(str);

        if (tersStr == str) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");


        // asal sayi olup oolmadigini yazdirin

        int sayi = 23;


        System.out.println(C04_AsalSayi.asalSayiMi(sayi));

        boolean sonuc = C04_AsalSayi.asalSayiMi(sayi);

        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal sayidir");
        } else {
            System.out.println("Girilen " + sayi + " asal sayi degildir");

        }

    }
  }
}