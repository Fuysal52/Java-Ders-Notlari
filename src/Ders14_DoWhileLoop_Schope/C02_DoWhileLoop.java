package Ders14_DoWhileLoop_Schope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicdan istedigi kadar sayi alin .
        // Kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        do {
            System.out.println("Lutfen toplanmak icin tamsayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        } while (girilenSayi!=0);

        System.out.println("Girilen sayilarin toplami :" + toplam);

    }
}
