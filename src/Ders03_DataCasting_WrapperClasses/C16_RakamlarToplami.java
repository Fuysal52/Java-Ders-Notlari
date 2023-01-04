package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C16_RakamlarToplami {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBas=0; // ilk basta 0 olsun
        int rakamlarToplami=0; // ilk basta 0 olsun

        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami + birlerBas ;
        sayi= sayi / 10 ;

        birlerBas=sayi%10 ;
        rakamlarToplami=rakamlarToplami+ birlerBas ;
        sayi = sayi/10 ;

        birlerBas= sayi%10 ;
        rakamlarToplami=rakamlarToplami+birlerBas ;
        sayi=sayi/10 ;

        System.out.println("Sayinin Rakamlar Toplami :" + rakamlarToplami);
    }
}
