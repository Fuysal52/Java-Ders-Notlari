package Ders02_VariableScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini,soyimini,yasini aliniz
        // Isminiz: ....
        // Soyisminiz...
        // Yasiniz : ...
        // Kaydiniz tamamlanmistir yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        System.out.println("Isminiz:"+ isim +"\n"+"Soyisminiz:"+ soyisim+"\n"
                           +"Yasiniz:" + yas+"\n"+"Kaydiniz basariyla tamamlanmistir"  );
    }
}


