package Ders04_IncrementDecrement_Concatenation;

public class C06_Concatenation {
    public static void main(String[] args) {


        String a="Hello";
        int b = 2;
        int c = 3;

        System.out.println(a+b+c); // Hello23 === once String oldugu icin geri kalani yanyana yazdiriyor
        System.out.println(c+b+a); // 5Hello==== Once int lari topluyor 2+3=5 sonra String ile birlestiriyor
        System.out.println(a+(b+c)); // Hello5 == once parantez yapildigi icin 2+3=5 sonra String ile birlestiriyor
        System.out.println(a+b*c); // Hello6 == once carpma yapildigi icin 2*3=6 sonra String ile birlestiriyor
    }
}
