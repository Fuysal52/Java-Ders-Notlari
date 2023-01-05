package Ders13_MethodOverloading_WhileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3); // 11.7
        toplama('a', 'b'); // 195

        // ilk olarak %100 uyumlu parqametre arar
        // %100 uyumlu method yoksa calisabilecek method var mi diye kontrol eder
        // calisacak method birden fazla olursa, min casting yaparak kullanabilecegini tercih eder

        toplama(8.4,6); // 14.4


    }
    public static void toplama(int sayi2 , double sayi1) {
        System.out.println(" int ve double sayisinin toplami :" + (sayi1+sayi2));
    }

    public static void toplama (double sayi1 , double sayi2){
        System.out.println("2 double sayinin toplami :" + (sayi1+sayi2));
    }
}
