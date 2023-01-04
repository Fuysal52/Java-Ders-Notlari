package Ders11_ForLoop;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        // Kullanicidan baslangiz ve bitis degerleri olarak pozitif sayilar alin
        // sinirlar dahil olarak aralardaki tum sayilarin toplamini yazdirin
        // bitis degeri baslangiz degerinden kucukse , uyari yazdirin islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini poztif tam sayi olarak yazin");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis degerini poztif tam sayi olarak yazin");
        int bitis = scan.nextInt();

        if (bitis < baslangic) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        } else {

            int toplam = 0;
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
            System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami :" + toplam);
        }
    }
}