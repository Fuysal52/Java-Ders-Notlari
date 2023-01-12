package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C14_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi aliniz
        // ve kullanicinin istedigi islemi sorun
        // +,-,*,/ isaretlerinden hangisini girerse 2 sayi icin o islemi yapin
        // baska bir isaret secerce "yanlis islem tercihi" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lutfen istediginiz islemi giriniz\n +, -, *, /");
        char islem=scan.next().charAt(0);


        switch (islem) {
            case '+' :
                System.out.println("Sayilarin toplami:" + (sayi1+sayi2));
                break;
            case '-' :
                System.out.println("Sayilarin farki:" + (sayi1-sayi2));
                break;
            case '*' :
                System.out.println("Sayilarin carpimi:" + (sayi1*sayi2));
                break;
            case '/' :
                System.out.println("Sayilarin bolumu:" + (sayi1/sayi2));
                break;
            default  :
                System.out.println("Yanlis islem girisi");
        }
    }
}
