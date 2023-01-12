package Ders10_StringManipulations3;

public class C05_replaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir ";

        // tum a lari degilde ilk a'yi degistirmek istersek
        System.out.println(str.replaceFirst("a","A")); // JAva heyecandir

        // ilk harf veya rakami * yap
        System.out.println(str.replaceFirst("\\w", "*")); // *ava heyecandir

        // BASINDA VE SONUNDA SPACE varsa silelim
        System.out.println(str.trim());
    }
}
