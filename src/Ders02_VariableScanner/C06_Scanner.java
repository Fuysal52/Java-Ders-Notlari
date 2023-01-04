package Ders02_VariableScanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin kisa ve uzun kenar uzunluklarini aliniz
        // Dikdortgenin alanini hesaplayiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz");

        int kisaKenar=scan.nextInt();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");

        int uzunKenar=scan.nextInt();

        int dikdortgenAlani= kisaKenar*uzunKenar;

        System.out.println("Dikdortgenin alani:"+ dikdortgenAlani);
    }
}
