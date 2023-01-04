package Ders05_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int notunuz= scan.nextInt();

        if (notunuz >= 50) {
            System.out.println("Sinifi Gectiniz"); }

        if (notunuz<50){
            System.out.println("Maalesef Kaldiniz");}
    }
}
