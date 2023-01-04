package Ders02_VariableScanner;

import java.util.Scanner;

public class C16_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir int bir double sayi alin, bunlarin toplamini ve carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz ");
        int sayiInt= scan.nextInt();
        System.out.println("Lutfen bir ondalikli sayi giriniz ");
        double sayiDouble= scan.nextDouble();

        System.out.println("Sayilarin toplami: " + (sayiDouble+sayiInt));
        System.out.println("Sayilarin carpimi: " + sayiDouble*sayiInt);
    }
}
