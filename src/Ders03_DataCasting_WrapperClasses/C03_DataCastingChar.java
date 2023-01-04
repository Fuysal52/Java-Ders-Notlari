package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {


        int a= 'a'+'b' ;
        System.out.println(a);

        System.out.println('a' +'b'); // a ve b nin ascii degerlerini bulup onlari toplar... 97+98=195

        System.out.println(" " +'a' + 'b' );
        System.out.println('a'-32);

        // 'a'-32 nin char olarak sonucunu yazdirin

        System.out.println((char) ('a'-32));

        // kullanicidan bir char alin
        // ascii table dan kullanicidan girdigi char'in sonrasindaki 3 karakteri giriniz


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKarakter = scan.next().charAt(0);

        System.out.println("Girilen Karakter:"+ girilenKarakter);

        System.out.println("Girilen Karakterin bir sonrasi:"+(char)(girilenKarakter+1));
        // basina (char) koymazsak a'nin degerini 1 artirir. koyarsak bir sonraki karakteri cikartir

        System.out.println("Girilen Karakterin iki sonrasi:"+(char)(girilenKarakter+2));
        System.out.println("Girilen Karakterin uc sonrasi:"+(char)(girilenKarakter+3));
    }
}
