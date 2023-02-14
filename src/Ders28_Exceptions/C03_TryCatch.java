package Ders28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        // kullanicsdan toplamak icin sayilar alin
        // kullaniciya islemi bitirmesi icin q'ya basmasini isteyin
        // kullanici q'ya bastiginda toplam kac sayi girdigini
        // ve bu sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi= 0;
        int sayiAdedi = 0;
        int sayilarToplami=0;

        while (sayiAdedi<10000){
             try {

                 System.out.println("Toplamak icin tamsayi giriniz" +
                                   "\nBitirmek icin Q'ya basiniz");

                 girilenSayi= scan.nextInt();
                 sayilarToplami+=girilenSayi;
                 sayiAdedi++;

        } catch (InputMismatchException e) {

            String girilenDeger = scan.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")){
                System.out.println("Girilen " + sayiAdedi + "sayinin toplami " + sayilarToplami);
                break;
            } else {
                System.out.println("Gecersiz input");
            }
        }
    }

    }
}
