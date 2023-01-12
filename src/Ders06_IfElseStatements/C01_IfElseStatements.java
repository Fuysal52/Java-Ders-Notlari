package Ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan ucgenin kenarlarini giriniz
        // her kenardan sonra enter'a basiniz
        // Eskenar ise "Eskenar ucgen"yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz\nHer kenardan sonra enter'a basiniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0) {
            System.out.println("Eskenar Ucgen");
        }
        else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
