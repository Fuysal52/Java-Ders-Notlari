package Ders09_StringManipulations2;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";

        System.out.println(str1+ " "+ str2); // Java Candir
        System.out.println(str1.concat(str2)); // JavaCandir
        System.out.println(str1.concat(" ").concat(str2)); // Java Candir

        String a="Galata";
        String b="saray";
        String c="Sampiyon";
        String d="2";
        String e="3";

        System.out.println(a.concat(b).concat(" ").concat(c).concat(" ").concat(d+e));
    }
}
