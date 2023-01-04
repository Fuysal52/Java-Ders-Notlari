package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : -sayi);

    }
}
