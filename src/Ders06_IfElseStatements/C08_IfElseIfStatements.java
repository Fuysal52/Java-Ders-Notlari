package Ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini aliniz
        // Kadin, 60 yas uzeri, erkek, 65 yas uzeri emekli olabilir
        // Cinsiyet ve yas gozonune alarak "Emekli olabilirsin"
        // Emekli olman icin ... yil calisman gerekli yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tam sayi olarak yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi giriniz\nK: Kadin , E: Erkek");
        char cinsiyet=scan.next().charAt(0);

        if (cinsiyet=='E' && yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas>=60 ) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olman icin " + (65 - yas)+" yil gerekli");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olman icin " + (60 - yas)+" yil gerekli");
        } else if (yas<=18 || yas<80) {
            System.out.println("Gecersiz yas");
        } else {
            System.out.println("Gecersiz  cinsiyet girisi");
        }
    }
}
