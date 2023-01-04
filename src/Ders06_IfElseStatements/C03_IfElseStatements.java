package Ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan yasini isteyiniz
        // yasi 65 ve uzeri ise "Emekli olabilirsin"
        // yasi 65 den kucuk ise "Emekli olman icin gereken yil sayisi : " yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        int kalanYilSayisi = 65 - yas;


        if (yas >= 65) {
            System.out.println("Emekli Olabilirsin");
        } else {
            System.out.println("Emekli OLmak Icin Gereken Yil Sayisi:" + kalanYilSayisi);
        }
    }
}
