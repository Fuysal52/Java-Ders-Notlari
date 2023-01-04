package Ders06_IfElseStatements;

import java.util.Scanner;

public class C16_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin
        // sayi negatif is "negatif sayi"
        // sayi rakam ise "Girilen sayi rakam"
        // sayi iki  basamakli ise "Girilen sayi iki basamnakli"
        // sahyi 2 basamaktan buyukse "buyuk sayi"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi<0) {
            System.out.println("Negatif sayi");
        } else if (girilenSayi<=9) {
            System.out.println("Girilen sayi rakam");
        } else if (girilenSayi<=99) {
            System.out.println("Girilen sayi 2 basamakli");
        } else {
            System.out.println("Buyuk sayi");
        }

    }
}
