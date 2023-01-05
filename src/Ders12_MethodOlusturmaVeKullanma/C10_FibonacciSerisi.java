package Ders12_MethodOlusturmaVeKullanma;

public class C10_FibonacciSerisi {
    public static void main(String[] args) {

        // Verilen sayi adadince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 ....

        fibonaccidenSayiYazdir (9);
    }

    public static void fibonaccidenSayiYazdir(int adet) {

        if (adet<=0) {
            System.out.println("Gecersiz giris");
        } else if (adet==1) {
            System.out.println("0");
        } else if (adet==2) {
            System.out.println("0 1");
        } else {

            int sayi1=0;
            int sayi2=1;
            int sayi3=0;
            System.out.print("0 1 ");

            for (int i = 3; i <=adet ; i++) {

                sayi3=sayi1+sayi2;
                System.out.print(sayi3 + " ");
                sayi1=sayi2;
                sayi2=sayi3;
            }

        }
    }
}

