package Ders14_DoWhileLoop_Scope;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // verilen baslangic be bitis karakterleri dahil
        // aradaki tum degerleri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis karakterlerini giriniz");
        char baslangic = scan.nextLine().charAt(0);
        char bitis= scan.nextLine().charAt(0);

        do {
            System.out.print(baslangic);
            baslangic=(char)(baslangic+1);

        } while (baslangic<=bitis);
    }
}
