package Ders13_MethodOverloading_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        for (int i = 10; i <=99 ; i++) {
            if (i%7==0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");

        // ayni soruyu while ile yapalim

        int sayi= 10;

        while (sayi<100) {
            if (sayi%7==0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }

    }

}
