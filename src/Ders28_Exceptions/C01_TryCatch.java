package Ders28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Birbirine bolmek icin iki tamsayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            // 1-try bolumu :yapmak istedigimiz ama exc. riski olan kodlar
            System.out.println("Iki sayinin bolumu:" + sayi1/sayi2);
        } catch (ArithmeticException e)
                // 2-catch: bekledigimiz muhtemel exception ve
                //        bu exc. gerceklesirse hata dokumanini store edebilecegimiz variable

        {
            System.out.println("Bolecek sayi sifir olamaz");
            e.printStackTrace();

            // 3- catch blogu : exception gerceklesirse calismasini istedigimiz kodlar
            //                 burayi yazarken oncedlikle exc. olustugunda kodlarin calismasi
            //                 dursun mu ? yoksa devam mi etsin? karar vermeliyiz
        }
    }

}
