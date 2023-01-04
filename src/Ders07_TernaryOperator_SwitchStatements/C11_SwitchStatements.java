package Ders07_TernaryOperator_SwitchStatements;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan bir rakam aliniz
        // rakamin numarasina gore haftaici mi haftasonu mu yazdirin
        // bunlarin disinda ise gecersiz gun girisi yazdirin

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir rakam giriniz");
            int rakam = scan.nextInt();

            switch (rakam) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Hafta ici");
                    break;
                case 6:
                case 7:
                    System.out.println("Hafta sonu");
                    break;
                default:
                    System.out.println("Gecersiz gun numarasi");
            }
    }
 }
