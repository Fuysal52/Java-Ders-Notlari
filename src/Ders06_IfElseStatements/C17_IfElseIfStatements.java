package Ders06_IfElseStatements;

import java.util.Scanner;

public class C17_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir rakam aliniz
        // Girilen rakam a gore gununu yazdirin
        // Rakam 0 dan kucuk ve 7 den buyuk ise "gecersiz gun " yazdiirn

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam = scan.nextInt();

        if (rakam < 0 || rakam > 7) {
            System.out.println("Gecersiz gun numarasi");
        } else if (rakam == 1) {
            System.out.println("Pazartesi");
        } else if (rakam == 2) {
            System.out.println("Sali");
        } else if (rakam == 3) {
            System.out.println("Carsamba");
        } else if (rakam == 4) {
            System.out.println("Persembe");
        } else if (rakam == 5) {
            System.out.println("Cuma");
        } else if (rakam == 6) {
            System.out.println("Cumartesi");
        } else if (rakam == 7) {
            System.out.println("Pazar");
        }
    }
}
