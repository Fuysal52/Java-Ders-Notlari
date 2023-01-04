package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C11_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir tamsayi aliniz
        // Sayinin birler basamagi ile ilk 3 basamaginin toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();

        int birlerBasamagi=0;
        int ilkUcBasamak=0;

        birlerBasamagi= sayi%10 ;
        ilkUcBasamak = sayi/10;

        int sonuc= birlerBasamagi+ilkUcBasamak;
        System.out.println("Sonuc:"+sonuc );

    }
}
