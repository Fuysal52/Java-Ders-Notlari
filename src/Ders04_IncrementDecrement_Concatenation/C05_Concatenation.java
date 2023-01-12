package Ders04_IncrementDecrement_Concatenation;

public class C05_Concatenation {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        System.out.println("verilen iki degerin toplami:" + (a+b));

        // girilen 10 ve 20 sayilarinin toplami : 30

        System.out.println("girilen "+ a + " ve "+ b + " sayilarinin toplami :" + (a+b));

        System.out.println("sayilarin toplami:"+ a+b); // 1020 sayilarin toplami:1020 seklinde yanlis verdi
        System.out.println("sayilarin toplami:"+ (a+b)); //  30 bunun olmamasi icin parantez yapiyrz (a+b)

    }
}
