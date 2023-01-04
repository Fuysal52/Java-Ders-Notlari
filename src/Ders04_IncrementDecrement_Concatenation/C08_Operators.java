package Ders04_IncrementDecrement_Concatenation;

public class C08_Operators {
    public static void main(String[] args) {

        int a=10;

        System.out.println(a%3==0 && a%5==0) ; // false --- 3'e ve 5'e bolunebilen sayilar icin
        System.out.println(a%3==0 || a%5==0) ; // true ---  3'e veya 5'e bolunebilen sayi icin

        System.out.println(0<a && a<100); // true --- java 3'lu karsilastirma yapmaz. bunun yerine ikili karsilastirma yapar
        System.out.println(0>a || a>100); // false
    }
}
