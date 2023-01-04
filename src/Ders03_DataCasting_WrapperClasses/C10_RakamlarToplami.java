package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C10_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi=sayi%10 ;
        rakamlarToplami= rakamlarToplami+birlerBasamagi ;
        sayi= sayi/10 ;

        birlerBasamagi=sayi%10 ;
        rakamlarToplami= rakamlarToplami+birlerBasamagi ;
        sayi= sayi/10 ;

        birlerBasamagi=sayi%10 ;
        rakamlarToplami= rakamlarToplami+birlerBasamagi ;
        sayi= sayi/10 ;

        birlerBasamagi=sayi%10 ;
        rakamlarToplami= rakamlarToplami+birlerBasamagi ;
        sayi= sayi/10 ;

        System.out.println("Sayinin Rakamlar Toplami:"+ rakamlarToplami);
    }
}
