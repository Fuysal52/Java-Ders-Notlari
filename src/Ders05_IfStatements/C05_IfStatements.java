package Ders05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin kenar uzunluklarini alin
        // eskenar ucgen ise "Eskenar ucgen "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc  kenar uzunlugunu giriniz");
        int birinciKenar = scan.nextInt();
        int ikinciKenar = scan.nextInt();
        int ucuncuKenar = scan.nextInt();

        if (birinciKenar == ikinciKenar && ikinciKenar==ucuncuKenar) {
            System.out.println("Eskenar Ucgen");}
    }
}
