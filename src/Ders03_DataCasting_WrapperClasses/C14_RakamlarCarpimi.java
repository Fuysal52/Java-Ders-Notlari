package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C14_RakamlarCarpimi {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir tamsayi aliniz
        // sayinin rakamlar carpimini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarCarpimi=1;

        birlerBasamagi=sayi%10;
        rakamlarCarpimi=rakamlarCarpimi*birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarCarpimi=rakamlarCarpimi*birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarCarpimi=rakamlarCarpimi*birlerBasamagi;
        sayi=sayi/10;

        System.out.println("Sayinin Rakamlar Carpimi:"+ rakamlarCarpimi);
    }
}
