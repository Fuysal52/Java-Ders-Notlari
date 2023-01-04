package Ders04_IncrementDecrement_Concatenation;

public class C06_Concatenation {
    public static void main(String[] args) {


        String a="Hello";
        int b = 2;
        int c = 3;

        System.out.println(a+b+c); // Hello23
        System.out.println(c+b+a); // 5Hello
        System.out.println(a+(b+c)); // Hello5
        System.out.println(a+b*c); // Hello6
    }
}
