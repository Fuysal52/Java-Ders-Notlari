package Ders13_MethodOverloading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {

        // random olarak 1 ile 100 arasinda bir sayi olusturun
        // kullanicidan bu sayiyi bilmesini isteyin
        // kullanici her deger girdiginde tuttugunuz sayi ile karsilastirp
        // tahminin buyult veya kucult deyip
        // -sayiyi bildiginde 3 veya daha az tahminde bildiyse "Voowww"
        // - 4-8 arasinda bildiyse "Aferin"
        // - daha fazla tahminde bildiyse "basarisiz"yazdirin

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);
        int sayac = 1;
        int tahmin = 0;

        Scanner scan=new Scanner(System.in);

        while (tutulanSayi !=tahmin){
            System.out.println("Lutfen bir tahmin giriniz");
            tahmin= scan.nextInt();

            if (tutulanSayi==tahmin) {
                System.out.println(sayac + " tahmin ile tuttugun sayiyi buldun");
                if (sayac<=3) {
                    System.out.println("Voooww");
                } else if (sayac<8) {
                    System.out.println("Aferin");
                } else {
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahmin<tutulanSayi) {
                System.out.println("Sayiyi buyut");
                sayac++;
            } else {
                System.out.println("Sayiyi kucult");
                sayac++;
            }

        }
    }
}
