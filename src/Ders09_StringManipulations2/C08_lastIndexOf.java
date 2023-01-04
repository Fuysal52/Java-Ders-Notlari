package Ders09_StringManipulations2;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calisman lazim cok";

        // ilk a'nin index'ini yazdirin
        System.out.println(str.indexOf("a")); // 1
        // son a'nin index'ini yazdiirn
        System.out.println(str.lastIndexOf("a")); // 39

        System.out.println(str.lastIndexOf("a", 15)); // 3 --- 15.index'ten geri dogru gelir ilk a'yi bulur

        // verilen str'da cok kelimesini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calisman lazim cok

        int ilkCokKelimesi = str.indexOf("cok");
        int sonCokKelimesi = str.lastIndexOf("cok");


        if (!str.contains("cok")) {
            System.out.println("cok kelimesi kullanilmamis");
        } else if (ilkCokKelimesi==sonCokKelimesi) {
            System.out.println("cok kelimesi bir kere kullanilmis");
        } else {
            System.out.println("cok kelimesi birden fazla kullanilmis");

        }
    }
}
