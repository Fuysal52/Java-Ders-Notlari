package Ders09_StringManipulations2;

import java.util.Scanner;

public class C09_indexOf_lastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir String alin ve aranacak metin alin. Arana metin String icerisinde
        // kullanimini kontrol ederek uygun olarak yazdirin
        // - String aranan metni icermiyor
        // - Aranan metin String'i sadece 1 kere kullanilmis
        // - Aranan metin String'de 1 den fazla kullanilmis

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir bir cumle giriniz");
        String girilanCumle= scan.nextLine();
        System.out.println("Lutfen aranacak metni giriniz");
        String aranacakMetin= scan.nextLine();

        int arananMetinIlk= girilanCumle.indexOf(aranacakMetin);
        int arananMetinSon= girilanCumle.lastIndexOf(aranacakMetin);


        if (!girilanCumle.contains(aranacakMetin)){
            System.out.println("Cumle aranan metni icermiyor");
        } else if (arananMetinIlk==arananMetinSon) {
            System.out.println("Aranan metin cumle'de 1 kere kullanilmis");
        } else {
            System.out.println("Aranan metin cumle'de 1'den fazla kullanilmis");
        }
    }
}
