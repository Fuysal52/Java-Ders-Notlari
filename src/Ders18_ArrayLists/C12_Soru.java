package Ders18_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Soru {
    public static void main(String[] args) {

        // Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun

        System.out.println(fibonacciListesiOlustur());


    }
    public static List<Integer> fibonacciListesiOlustur () {

        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac tane fibonacci sayisi istedigini giriniz");
        int n = scan.nextInt();

        if (n<1){
            System.out.println("Gecersiz sayi");
            return null;
        } else if (n==1) {
            fibonacciList.add(0);
            return fibonacciList;
        } else if (n==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;
        } else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;

            fibonacciList.add(sayi1);
            fibonacciList.add(sayi2);

            for (int i = 2; i <=n-1 ; i++) {

                fibonacciList.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;

            }
        }
        return fibonacciList;
    }

}
