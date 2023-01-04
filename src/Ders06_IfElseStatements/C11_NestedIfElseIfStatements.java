package Ders06_IfElseStatements;

import java.util.Scanner;

public class C11_NestedIfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cisiyet = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cisiyet.equalsIgnoreCase("Kadin")) {
            if (yas < 0 || yas > 90) {                // (... - 0 ) ile ( 90 - ... ) arasindaki yaslari kontrol eder
                System.out.println("Yas girisi gecersiz");
            } else if (yas < 60) {                   // ( 0 - 59 ) yas arasini kontrol eder
                System.out.println("Emekli olmak ici" + (60 - yas) + " yil daha calisman gerekir");
            } else {                                 // ( 60 - 90 ) yas arasini kontrol eder
                System.out.println("Emekli olabilirsin");
            }
        } else if (cisiyet.equalsIgnoreCase("erkek")) {
            if (yas < 0 || yas > 90) {
                System.out.println("Yas girisi gecersiz");
            } else if (yas < 65) {
                System.out.println("Emekli olmak ici" + (65 - yas) + " yil daha calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else {
            System.out.println("Cinsiyet girisi hatali");
        }
    }
}
