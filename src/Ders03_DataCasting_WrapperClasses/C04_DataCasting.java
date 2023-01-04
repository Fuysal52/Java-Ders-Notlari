package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi aliniz. sonucu double olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bolunecek tam sayisi giriniz");
        int a= scan.nextInt();

        System.out.println("Lutfen bolecek tam sayisi giriniz");
        int b= scan.nextInt();

        System.out.println("a/b nin degeri:" +a/b);


        double dogruSonuc= (double)a/b;
        System.out.println("Sonuc :"+ dogruSonuc);

    }
}
