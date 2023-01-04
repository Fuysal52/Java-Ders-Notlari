package Ders02_VariableScanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini,soyismini ve yasini alinizi
        // Girilen bilgiler  : A Uysal,10 seklinde yazdirniz

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        System.out.println("Girilen bilgiler: "+ isim.charAt(0)+ " "
                +soyisim + "," + yas) ;
    }
}
