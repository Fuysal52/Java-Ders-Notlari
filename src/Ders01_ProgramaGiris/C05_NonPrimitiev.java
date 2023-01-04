package Ders01_ProgramaGiris;

public class C05_NonPrimitiev {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.toLowerCase()); // toLowerCase() kucuk harfe ceviri
        // Sadece anlik degistirir. kalici degildir
        System.out.println(str.toUpperCase());  // BUYUK HARFE CEVIRI
        // Sadece o anlik yapar . kalici degildit


        System.out.println(str.isEmpty());       // string in ici bos mu demek/ sonuc true false ile gelir
    }
}
