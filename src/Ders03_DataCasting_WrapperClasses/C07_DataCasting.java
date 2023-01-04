package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C07_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan yazili notlarini aliniz.
        // Ortalamasini double olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 1.yazili notunu giriniz");
        int a= scan.nextInt();

        System.out.println("Lutfen 2.yazili notunu giriniz");
        int b= scan.nextInt();


        System.out.println("Not ortalamasi :"+ (double)(a+b)/2);

    }
}
