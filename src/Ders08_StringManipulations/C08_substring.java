package Ders08_StringManipulations;

public class C08_substring {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length()); // 19

        // Metnin tam ortasindaki karakter nedir ?

        System.out.println(str.charAt(str.length()/2)); // n === karakterSayisi/2 dir

        // son karakteri yazdirin?

        System.out.println(str.charAt(str.length()-1)); // p

        // bir karakteri degilde verilen String in bir metin parcasini elde etmek icin?
        // "ogren"yazdiralim

        System.out.println(str.substring(5,9)); // ogre *** substring(bas,bitis) methodunda
        // baslangic olarak yazilan index dahildir(incluisive)
        // bitis olarak yaziloan index harictir (exclusive)
        System.out.println(str.substring(5,10)); // ogren

        // str'dan "Java"kelimesini yazdirin

        System.out.println(str.substring(0,4)); // Java
        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16)); // kap
        System.out.println(str.substring(str.length()-3)); // kap

        // sunstring kullanarak sadece J yazdirin

        System.out.println(str.substring(0,1)); // J

        // substring kullanarak 9. indek teki harfi buyuk yazdirin
        // charAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hale string oldugundan method kullanmaya devam edebiliriz

        System.out.println(str.substring(9,10).toUpperCase()); // N
        System.out.println(str.toUpperCase().charAt(9)); // N

        System.out.println(str.substring(5,5)); // hiclik yazdirir. yani konsolda bos bir satir olusur

        // System.out.println(str.substring(4,3)); // bu hata verir

        // System.out.println(str.substring(25,28)); // bu hata verir

        System.out.println(str.substring(str.length())); // hiclik yazdirir

    }
}
