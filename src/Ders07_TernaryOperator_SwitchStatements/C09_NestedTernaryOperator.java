package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C09_NestedTernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi aliniz
        // Sayi pozitifse , cift sayi veya cift sayi degil seceneklerinden uygun olani
        // sayi pozitif degilse , 3 basamakli veya 3 basamakli degil yazdirn

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi>0 ? (sayi%2==0 ? "Cift sayi": "Tek sayi ") : (-100>=sayi && sayi>=-999 ? "3 basamakli" : "3 basamakli degil"));

    }
}
