package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C13_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmalarindan bir harf alin
        // anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin
        // I: International, S:Software , T:Testing , Q:Qualifications, B:Board

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamini ogrenmek istediginiz harfi giriniz");
        char girilenHarf = scan.next().charAt(0);

        switch (girilenHarf) {
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualificatiaons");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Gecersiz harf girisi");

        }
    }
}
