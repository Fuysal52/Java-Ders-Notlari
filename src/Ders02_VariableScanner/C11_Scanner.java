package Ders02_VariableScanner;

import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {

        // Kullanicidan karenin bir kenar uzunlugunu aliniz
        // Karenin cevresini hesaplayiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");

        int kareninKenarUzunlugu = scan.nextInt();
        int kareninCevresi = kareninKenarUzunlugu*4 ;

        System.out.println("Karenin Cevresi :" + kareninCevresi);

    }
}
