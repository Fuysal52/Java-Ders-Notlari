package Ders14_DoWhileLoop_Schope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanicdan istedigi kadar sayi alin .
        // Kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0; // Girilen sayi 0 sectigimiz icin ve while da sart 0'a esit oluna kadar calis
                           // dedigimiz icin bu kod while da hic calismadi.  bu 1. dezavantaj
        int toplam=0;

        while (girilenSayi!=0) {
            System.out.println("Lutfen toplanmak icin bir tamsayi giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }
        System.out.println("Girilen sayilarin toplami :" + toplam);
    }
}
