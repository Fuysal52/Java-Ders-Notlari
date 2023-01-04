package Ders02_VariableScanner;

import java.util.Scanner;

public class C14_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi aliniz ve karesini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        int sayininKaresi= sayi*sayi;
        System.out.println("Girilen sayinin karesi :" + sayininKaresi);

    }
}
