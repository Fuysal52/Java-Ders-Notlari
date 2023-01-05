package Ders13_MethodOverloading_WhileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(5)); // cok guzel
        System.out.println(str.substring(3,5)); // a

        // eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ayni isimdeki method'lardan hangisinin calisacagina argument/ parametre uyumu karar verir

        toplama(5,6,7); // 18
        toplama(2,5); // 7
        toplama(2.1,3); // 5,1

    }

    public static void toplama(int sayi1 , int sayi2) {
        System.out.println("2 tamsayinin toplami :" + (sayi1+sayi2));

    }

    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("3 tamsayinin toplami :" + (sayi1+sayi2+sayi3));
    }

    public static void toplama (double sayi1, int sayi2){
        System.out.println("double ve int sayisinin toplami :" + (sayi1+sayi2));
    }

    public static void toplama(int sayi2 , double sayi1) {
        System.out.println(" int ve double sayisinin toplami :" + (sayi1+sayi2));
    }

    public static void toplama (double sayi1 , double sayi2){
        System.out.println("2 double sayinin toplami :" + (sayi1+sayi2));
    }
}
