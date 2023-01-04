package Ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan bir karakter aliniz
        // girilen karakter kucuk harf ise "girilen harf kucuktur"
        // girilen karakter buyuk harf ise "girilen harf buyuktur"
        // harf degilse "Girilen karakter harf degildir" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter >= 'a' && girilenKarakter <= 'z') {
            System.out.println("Girilen harf kucuktur");
        } else if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {
            System.out.println("Girilen harf buyuktur");
        } else {
            System.out.println("Girilen karakter harf degildir");
        }
    }
}
