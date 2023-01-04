package Ders02_VariableScanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // Kullanicidan 2 tane sayi aliniz
        // Ortalamsini hesaplayiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen birinci sayisi giriniz");

        double birinciSayi=scan.nextDouble();

        System.out.println("Lutfen ikinici sayisi giriniz");

        double ikinciSayi=scan.nextDouble();

        double Ortalama= (birinciSayi+ikinciSayi)/2 ;

        System.out.println("Ortalama :" + Ortalama);
    }
}
