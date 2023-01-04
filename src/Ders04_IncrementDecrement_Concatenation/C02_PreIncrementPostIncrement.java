package Ders04_IncrementDecrement_Concatenation;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10; // sayi degerini olusturacagimiz b veriablina atayalim. sonra sayi degerini 1 artiralim

        int b = sayi ;
        sayi++ ;

        System.out.println(b); // 10
        System.out.println(sayi); // 11

        sayi=11;
        int c = sayi ++;
        System.out.println(c); // 11
        System.out.println(sayi); // 12

        sayi=11;
        c=++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12

    }
}
