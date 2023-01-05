package Ders12_MethodOlusturmaVeKullanma;

import java.util.Scanner;

public class C06_HesapMakinesi {
    public static void main(String[] args) {

        // Kullanicidan iki sayi ve istedigi islemi alin
        // bir method olusturup sayilari istenen islemi uygulayip sonucu dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Lutfen istediginiz islemi seciniz + , - , * , / ");
        char islem= scan.next().charAt(0);

        System.out.println(hesapMakinesi(sayi1,sayi2,islem));

    }
    public static double hesapMakinesi(double sayi1, double sayi2, char islem) {
        switch (islem) {
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '*':
                return sayi1*sayi2;
            case '/':
                return sayi1/sayi2;
            default:
                return 0;
        }
    }
}
