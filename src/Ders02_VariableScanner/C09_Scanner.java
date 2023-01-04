package Ders02_VariableScanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ad,soyad ve memleketini isteyiniz
        // Bu bilgileri altalta olcak sekilde yazdiriniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");

        String adiniz=scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");

        String soyadiniz=scan.nextLine();

        System.out.println("Lutfen memleketinizi giriniz");

        String memleket=scan.nextLine();

        System.out.println("Adiniz: " +adiniz +"\n"+ "Soyadiniz :"+ soyadiniz + "\n"+ "Memleketiniz :"+ memleket);
    }
}
