package Ders04_IncrementDecrement_Concatenation;

public class C07_Operators {
    public static void main(String[] args) {


        int a=20;
        a=a+10; // 30

        int b =20;

        // a ile b esit ise... a ile b esit mi sorusu yerine javada == kullanilir

        System.out.println(a==b);// false
        System.out.println(a==b+10); // true

        boolean c = 20==b;
        System.out.println(c); // true

        int x=10;
        int y=15;

        System.out.println(x!=y); // true
        System.out.println(x!=y-5); // false

        int e=10;
        int d=15;

        System.out.println(e>d && e>0); // false
        System.out.println(e<=d-5 && e>d-8); // true

        System.out.println(e<d || e>d-3); // true
        System.out.println(e>d || d<0); // false

    }
}
