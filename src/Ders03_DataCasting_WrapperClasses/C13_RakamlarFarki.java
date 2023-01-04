package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C13_RakamlarFarki {
    public static void main(String[] args) {

        // Kullanicidan iki basamakli pozitif bir tamsayi aliniz
        // Birler basamagindan onlar basamagini farkini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir pozitif tam sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi= sayi % 10;
        int onlarBasamagi= sayi/10;

        System.out.println("Sonuc:"+ (birlerBasamagi-onlarBasamagi));
    }
}
