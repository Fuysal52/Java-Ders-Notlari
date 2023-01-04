package Ders02_VariableScanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        System.out.println ("Lutfen isminizi giriniz");

        String kullaniciIsmi = scan.nextLine();

        System.out.println("Girilen kullanici ismi : " + kullaniciIsmi );

        System.out.println(kullaniciIsmi.toUpperCase()); // Tum harfleri buyuk harf ile yazdirin
        System.out.println(kullaniciIsmi.toLowerCase()); // Tum harfleri kucuk harf ile yazdirin
    }
}
