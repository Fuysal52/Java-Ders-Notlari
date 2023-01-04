package Ders02_VariableScanner;

import java.util.Scanner;

public class C15_Scanner {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip iksinin degerlerini degistiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        int tepm;
        tepm=sayi2;
        sayi2=sayi1;
        sayi1=tepm;

        System.out.println("Sayilarin yerini degistirelim : "
                + "\nSayi1 in yeni degeri:" +sayi1
                + "\nSayi2 nin yeni degeri:" +sayi2 );

    }
}
