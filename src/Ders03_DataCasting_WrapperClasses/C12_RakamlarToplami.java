package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C12_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan iki basamakli pozitif bir sayi aliniz
        // Sayinin rakamlari toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz");
        int sayi= scan.nextInt(); // 12

        int birlerBasamagi = sayi % 10; // 2
        int onlarBasamagi = sayi/10; // 1


        System.out.println("Sayinin rakamlar Toplami:" + (birlerBasamagi+onlarBasamagi));
    }
}
