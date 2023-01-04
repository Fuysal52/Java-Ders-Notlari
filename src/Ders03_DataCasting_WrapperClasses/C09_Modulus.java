package Ders03_DataCasting_WrapperClasses;

public class C09_Modulus {
    public static void main(String[] args) {

        int sayi=3246;
        int birlerBasamagi=sayi % 10 ;
        System.out.println("Birler basamagi:" + birlerBasamagi); // 6

        sayi=sayi/10;
        System.out.println(sayi); // 342

        birlerBasamagi=sayi%10;
        System.out.println("Birler basamagi:" + birlerBasamagi); // 2

        sayi=sayi/10;
        System.out.println(sayi); // 34

        birlerBasamagi=sayi%10;
        System.out.println("Birler basamagi:" + birlerBasamagi); // 4

        sayi=sayi/10;
        System.out.println(sayi); // 3

    }
}
