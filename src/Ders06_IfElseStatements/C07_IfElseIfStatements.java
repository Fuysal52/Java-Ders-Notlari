package Ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan agirligini kilo olarak alin
        // Boyunu cm olarak alin
        // Vucut kutle indeksini hesaplayiniz


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Agirliginizi kilo olarak giriniz");
        double agirlik= scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();

        double vke=agirlik*10000 / ( boy*boy);
        System.out.println("Vucut Kutle Indeksiniz :" + vke);

        if (vke>=30) {
            System.out.println("Obez");
        } else if (vke>=25) {
            System.out.println("Kilolu");
        } else if (vke>=20) {
            System.out.println("Normal");
        } else
            System.out.println("Zayif");
    }

}
