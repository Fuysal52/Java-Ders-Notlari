package Ders13_MethodOverloading_WhileLoop;

import java.util.Random;

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
        int tutulanSayi = rnd.nextInt();

    }
}
