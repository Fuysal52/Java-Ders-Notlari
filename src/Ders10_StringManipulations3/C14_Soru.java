package Ders10_StringManipulations3;

import java.util.Scanner;

public class C14_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir String alin
        // String'in uzunlugu cift sayi ise tam ortasina :) koyun
        // tek sayi ise ortadaki harfi silin :( koyun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();


        if (cumle.length()%2==0) {
            System.out.println(cumle.substring(0,cumle.length()/2) +":)"+ cumle.substring(cumle.length()/2,cumle.length()));
        } else {
            System.out.println(cumle.substring(0, cumle.length()/2) + ":(" + cumle.substring(cumle.length()/2+ 1, cumle.length()));

        }
    }
}
