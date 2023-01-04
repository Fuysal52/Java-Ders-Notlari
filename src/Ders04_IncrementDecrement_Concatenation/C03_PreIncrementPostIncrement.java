package Ders04_IncrementDecrement_Concatenation;

public class C03_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        sayi++ ;
        System.out.println(sayi); // 11

        ++ sayi;
        System.out.println(sayi); // 12

        System.out.println(sayi++); // bu satirda java sayinin once eski degerini yazdiracak=12 . sonra degerini 1 artiracak=13
        System.out.println(sayi); // 13

        System.out.println(++sayi); // bu satirda once sayi degerini 1 artiracak= 13 sonra yazdiracak=14
        System.out.println(sayi); // 14
    }
}
