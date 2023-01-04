package Ders11_ForLoop;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerleri alin.
        // Sayilar pozitif tamsayi olsun
        // Sinirlar dahil tum sayilarin toplamini yazdirin
        // baslangic degeri bitis degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini pozitif tam sayi olarak giriniz");
        int baslangic = scan.nextInt();
        int bitis= scan.nextInt();

        int toplam=0;

        for (int i = baslangic; i <=bitis ; i++) {
            toplam+=i;

        }
        System.out.println(baslangic + " ve " + bitis + " degerlerindeki sayilarin toplami :" + toplam );

    }
}
