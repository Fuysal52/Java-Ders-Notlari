package Ders06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan notunu aliniz
        // 50 den buyuk ve esitse Sinifi gectiniz
        // degilse maalesef kaldiniz yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=50){
            System.out.println("Sinifi Gectiniz");}
        else {
            System.out.println("Maalesef Kaldiniz");}
    }
}
