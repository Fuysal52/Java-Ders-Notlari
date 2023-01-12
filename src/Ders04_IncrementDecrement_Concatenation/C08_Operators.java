package Ders04_IncrementDecrement_Concatenation;

public class C08_Operators {
    public static void main(String[] args) {

        int a=10;

        System.out.println(a%3==0 && a%5==0) ; // false --- 3'e ve 5'e bolunebilen sayilar icin
        System.out.println(a%3==0 || a%5==0) ; // true ---  3'e veya 5'e bolunebilen sayi icin

        System.out.println(0<a && a<100); // true --- 0<a<100 arasindaki sayilari bulmak icin
        System.out.println(0>a || a>100); // false --- 0 ile 100 un disindaki sayilari bulmak icin
    }
}
