package Ders02_VariableScanner;

import java.util.Scanner;

public class C12_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ad,soyad ve yasini aliniz "Azra Uysal 10"
        // Kaydiniz: au 10 seklinde yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String adiniz = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyadiniz = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yasiniz = scan.nextInt();

        System.out.println("Kaydiniz : " + adiniz.charAt(0)+soyadiniz.charAt(0)+ " " + yasiniz);
    }
}
