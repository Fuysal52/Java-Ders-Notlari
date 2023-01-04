package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C15_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan bir double bir tam sayi alin
        // double sayisi ikinci sayiya bolun
        // Bolum isleminin sonucunun tam sayi kismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk olarak ondalikli bir sayi ve sonrada bir tam sayi giriniz");
        double sayi1= scan.nextDouble();
        int sayi2= scan.nextInt();

        System.out.println("Bolum sonucu:" + (int)(sayi1/sayi2));
    }
}
