package Ders02_VariableScanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Kullanicidan darinenin yaricapini aliniz
        // Dairenin cevresini hesaplayiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen dairenin yaricapini giriniz");

        double yaricap=scan.nextDouble();

        double daireninCevresi= 2*3.14*yaricap ;
        System.out.println("Dairenin Cevresi : "+ daireninCevresi );
    }
}
