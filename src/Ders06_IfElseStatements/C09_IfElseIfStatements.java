package Ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan uc kenar alin
        // ucgen ikizkenar ise "Ikizkenar" degilse "Ikizkenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3) ||
                (kenar1==kenar3 && kenar2!=kenar3 )||
                (kenar3==kenar2 && kenar2!=kenar1)) {
            System.out.println("Ikizkenar ucgen");
        } else {
            System.out.println("Ikizkenar ucgen degil");
        }
    }
}
