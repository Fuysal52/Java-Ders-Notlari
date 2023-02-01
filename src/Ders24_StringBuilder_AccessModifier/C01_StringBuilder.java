package Ders24_StringBuilder_AccessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        StringBuilder sb2 = new StringBuilder(11);
        System.out.println(sb2.capacity()); // 11
        System.out.println(sb2.length()); // 0

        StringBuilder sb3 = new StringBuilder("Java candir");
        System.out.println(sb3.capacity()); // 27
        System.out.println(sb3.length()); // 11

        sb2.append("Java");
        System.out.println(sb2); // Java
        System.out.println(sb2.capacity()); // 11


        sb2.append(" candir");
        System.out.println(sb2); // Java candir
        System.out.println(sb2.capacity()); // 11

        sb2.append(".");
        System.out.println(sb2); // Java candir.
        System.out.println(sb2.capacity()); // 24 = 2*11+2
    }
}
