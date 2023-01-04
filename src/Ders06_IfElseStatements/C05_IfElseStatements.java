package Ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // Girilen harf kucuk harf ise onu buyuk harf olarak yazdirin
        // Yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter >= 'a' && girilenKarakter <= 'z') {
            System.out.println((char) (girilenKarakter - 32));
            System.out.println(Character.toUpperCase(girilenKarakter));
        } else {
            System.out.println(girilenKarakter);
        }
    }
}
