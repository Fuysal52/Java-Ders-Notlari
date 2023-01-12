package Ders09_StringManipulations2;

public class C03_startWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("j")); // false
        System.out.println(str.startsWith("Java mutluluktur")); // true
        System.out.println(str.startsWith("")); // true

        // contains ile startWith farki... biri icerir mi diye bakiyor biri var mi diye bakiyor

        System.out.println(str.contains("mutlu")); // true
        System.out.println(str.startsWith("mutlu")); // false

        // 5. index ve sonrasi mutlu ile baslar mi

        System.out.println(str.startsWith("mutlu", 5 )); // true
        System.out.println(str.startsWith("va", 2)); // true

    }
}
