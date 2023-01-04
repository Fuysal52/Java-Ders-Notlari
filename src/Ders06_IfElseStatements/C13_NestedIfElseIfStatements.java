package Ders06_IfElseStatements;

import java.util.Scanner;

public class C13_NestedIfElseIfStatements {
    public static void main(String[] args) {

        // Lutfen mesafeyi km olarak giriniz
        // Lutfen cevirmek istediginiz birimi giriniz
        // istedigi birim metre veya santimetre ise cevirip yazdirin
        // yoksa "Istediginiz birim sisteme kayitli degil "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz");
        int mesafe=scan.nextInt();

        System.out.println("Lutfen cevirmek istediginiz birimi yaziniz\nMetre: M , Santimetre: S ");
        char istenenBirim=scan.next().charAt(0);

        if ((istenenBirim=='M' || istenenBirim=='m')) {
            System.out.println("Istenen birim:" + mesafe*1000);
        } else if ((istenenBirim=='S' || istenenBirim=='s')) {
            System.out.println("Istenen birim:" + mesafe*100000);
        } else {
            System.out.println("Istediginiz birim sisteme kayitli degil");
        }
    }
}
