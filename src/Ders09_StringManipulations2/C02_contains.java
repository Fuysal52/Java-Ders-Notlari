package Ders09_StringManipulations2;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ogren, mutlu ol";

        // str mutlu iceriyor mu ?

        System.out.println(str.contains("mutlu")); // true

        // charSequense ; char dizisi

        System.out.println(str.contains("j")); // false
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true
    }

}
