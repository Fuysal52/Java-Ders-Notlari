package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C07_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alin
        // Buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println(sayi1<sayi2 && sayi1==sayi2?  sayi2 : sayi1);
    }
}
