package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan  bir ucgenin kenar uzunluklarini alin
        // ucgen eskenar ise "Eskenar ucgen"
        // degilse "Eskenar ucgen degil "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen eskenar ucgenin kenarlarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

    }
}
