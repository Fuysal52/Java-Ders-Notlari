package Ders02_VariableScanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir kelime aliniz
        // Girilen Kelimenin ilk harfi : a seklinde yazdiralim

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen bir kelime giriniz");

        char  ilkHarf = scan.next().charAt(0);

        System.out.println("Girilen kelimenin ilk harfi: "+ ilkHarf);
    }
}
