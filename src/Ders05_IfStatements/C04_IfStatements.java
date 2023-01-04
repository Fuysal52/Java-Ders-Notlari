package Ders05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin . 3 ile bolunuyrsa 3 e bolunebilen
        // 5 ile bolunebiliyrsa 5 ile bolunebilen yazdrn

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi %3 == 0){
            System.out.println("Uc ile bolunebilen sayi");}

        if (girilenSayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");}
    }
}
