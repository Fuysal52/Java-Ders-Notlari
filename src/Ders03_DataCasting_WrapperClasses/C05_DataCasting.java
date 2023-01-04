package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki ondalikli sayi aliniz. ve sayilari toplayin
        // Sonucu int olarak yazdirin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki tane ondalikli sayiyi giriniz");
        double ilkSayi=scan.nextDouble();
        double ikinciSayi=scan.nextDouble();

        System.out.println("Sonuc :" + (int)(ilkSayi+ikinciSayi));

    }
}
