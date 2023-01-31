package Ders23_Varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(5,8);
        topla(2,7,6);
        topla(1,7,8,6);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {

        System.out.println("dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4)); // 22
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {

        System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3)); // 15
    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2)); // 13
    }
}
