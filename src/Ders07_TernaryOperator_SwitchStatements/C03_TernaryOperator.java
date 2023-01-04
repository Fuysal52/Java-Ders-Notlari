package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan notunu isteyiniz
        // 50 ve daha buyukse "sinifi gectin"
        // degilse "Maalesef kaldin "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        System.out.println(not>=50 ? "Sinifi gectin" : "Maalesef kaldin");
    }
}
