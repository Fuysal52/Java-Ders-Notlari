package Ders02_VariableScanner;

import java.util.Scanner;

public class C13_Scanner {
    public static void main(String[] args) {

        // Kullanicidan 3 tane sayi aliniz. sonucu int olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayisi giriniz");
        double birinciSayi = scan.nextDouble();

        System.out.println("Lutfen ikinci sayisi giriniz");
        double ikinciSayi = scan.nextDouble();

        System.out.println("Lutfen ucuncu sayiyi giriniz");
        double ucuncuSayi = scan.nextDouble();

        double sayilarinToplami = birinciSayi + ikinciSayi + ucuncuSayi ;
        System.out.println("Sayilarin Toplami:" + sayilarinToplami);

        int toplam = (int) (sayilarinToplami);
        System.out.println("Toplam:" + toplam);

    }
}
