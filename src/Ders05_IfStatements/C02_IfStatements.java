package Ders05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayiyi kontrol edip 5 ile bolunebiliyorsa "sayi 5ín tam kati "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi % 5 ==0 ) {
            System.out.println("Girilen sayi 5ín kati");}

    }
}
