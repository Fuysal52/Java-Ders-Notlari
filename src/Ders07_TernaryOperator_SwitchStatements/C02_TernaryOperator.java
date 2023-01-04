package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan bir harf akiniz
        // Harf kucuk ise buyuk harfe cevirin, degilse aynen yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf yaziniz");
        char harf= scan.next().charAt(0);

        System.out.println (harf>='a' && harf<='z' ? (char)(harf-32) : harf );
    }
}
