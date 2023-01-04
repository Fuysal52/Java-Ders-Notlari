package Ders08_StringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan gun ismini girmesini isteyinm
        // girilen gun hafta ici bir gun ise "Simdi calisma zamani tatile ... gun var"yazdirin
        // hafta sonu ise "simdi dinlenme zamani "yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next();
        String kullanilacakGun=gunIsmi.toLowerCase();

        switch (kullanilacakGun) {
            case "pazartesi" :
                System.out.println(gunIsmi + " calisma zamani, tatile 5 gun var");
                break;
            case "sali" :
                System.out.println(gunIsmi + " calisma zamani, tatile 4 gun var");
                break;
            case "carsamba" :
                System.out.println(gunIsmi + " calisma zamani, tatile 3 gun var");
                break;
            case "persembe" :
                System.out.println(gunIsmi + " calisma zamani, tatile 2 gun var");
                break;
            case "cuma" :
                System.out.println(gunIsmi + " calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");
        }
    }
}
