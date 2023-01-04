package Ders04_IncrementDecrement_Concatenation;

public class C04_PreIncrementPostIncrement {
    public static void main(String[] args) {


        int a =10;
        System.out.println("a'nin degeri:" + ++a); // a nin degerini once artir (11) sonra ata (11)

        int b= a++; // b nin degerine a nin yeni degerini yaz (11) sonra a yi bir artir(12)
        System.out.println("b'nin degeri:" + b);

        int c= b++ + a ; // c icin b ile a yi topla 11+12=23 sonra b yi 1 artir (12)
        System.out.println("c'nin degeri:" + c);

        System.out.println("Son Toplam:" + (a+b+c));


        int x=20; // x=20

        int y= ++x; // x=21 , y=21

        int z= y++; // z=21 , y=22

        System.out.println(x + "," + y + "," + z); // 21,22,21

        int k=30;

        System.out.println(k++); // 30
        System.out.println(++k); // 32
        System.out.println(k++); // 32
        System.out.println(k); // 33

        int sayi1=40;

        int sayi2=sayi1++; // sayi2=40 , sayi1=41

        int sayi3=--sayi2; // sayi2=39 , sayi3= 39

        int sayi4=--sayi1; // sayi1=40 , sayi4=40

        System.out.println(sayi1 + "," + sayi2 + "," + sayi3 + ", " + sayi4 ); // 40,39,39,40

    }
}
