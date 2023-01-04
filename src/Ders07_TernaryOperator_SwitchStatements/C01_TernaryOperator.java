package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi aliniz
        // sayi 5'in kati ise "sayi 5'in kati"
        // degilse "5ín kati degil "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giiniz");
        int sayi= scan.nextInt();

        System.out.println(sayi%5==0 ? "Sayi 5'in kati" : "Sayi 5'in tam kati degil");
    }
}
