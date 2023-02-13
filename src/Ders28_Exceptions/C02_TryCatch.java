package Ders28_Exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*
            Try-catch bloklarinin amaci riski 0 yapmak degil
            kodu iyi analiz yapip , javanin cozemeyecegi durumlarda ne yapmasini istedigimizi kendisine soylemektir

            Java try blogunda basedemeyecegi bir sorunla karsilasirsa siz o sorunu deklare edene kadar
            yani catch () satirina kaar calismayi durdurur.
            bu durumda sorun olan satir ile catch satiri arasinda kodlar calismaz


         */

        // Kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Birbirine bolmek icin iki tamsayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            System.out.println("Iki sayinin bolumu:" + sayi1/sayi2);

            System.out.println("Kontrol1");
            System.out.println("Kontrol2");
            System.out.println("Kontrol3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }
    }
}
