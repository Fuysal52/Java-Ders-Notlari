package Ders02_VariableScanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        // Kullanicidan prizmanin 3 kenarini aliniz
        // Prizmanin alanini hesaplayiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen prizmanin birinci kenarini giriniz");

        int birinciKenar=scan.nextInt();

        System.out.println("Lutfen prizmanin ikinci kenarini giriniz");

        int ikinciKenar=scan.nextInt();

        System.out.println("Lutfen prizmanin ucuncu kenarini giriniz");

        int ucuncuKenar=scan.nextInt();

        int prizmaninHacmi=birinciKenar*ikinciKenar*ucuncuKenar;

        System.out.println("Prizmanin Hacmi:" + prizmaninHacmi);
    }
}
