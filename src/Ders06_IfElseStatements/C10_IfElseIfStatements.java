package Ders06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan notunu aliniz
        // Not 85 ve ustu ise "Notunuz AA"
        // Not 65 ve ustu ise "Notunuz BB"
        // Not 50 ve ustu ise "Notunuz CC"
        // ise "Notunuz DD"  yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Gecersiz not girisi");
        } else if (not >= 85) {
            System.out.println("Notunuz AA");
        } else if (not >= 65) {
            System.out.println("Notunuz BB");
        } else if (not >= 50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD");
        }
    }
}
