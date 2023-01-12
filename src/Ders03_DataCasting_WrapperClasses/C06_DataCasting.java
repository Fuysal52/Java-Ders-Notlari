package Ders03_DataCasting_WrapperClasses;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan ucgenin kenar uzunluklarini aliniz
        // ucgenin cevresini hesaplayiniz
        // sonucu int olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen birinci kenari giriniz");
        double a = scan.nextDouble();

        System.out.println("Lutfen ikinci kenari giriniz");
        double b = scan.nextDouble();

        System.out.println("Lutfen ucuncu kenari giriniz");
        double c = scan.nextDouble();

        double ucgeninCevresi = a+b+c ;
        System.out.println("Ucgenin Cevresi: " + (int)(a+b+c));
    }
}
