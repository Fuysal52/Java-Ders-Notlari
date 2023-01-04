package Ders10_StringManipulations3;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa "home home sweet home"
        // - cumlede is geciyorsa "calismak guzeldir"
        // - ikiside geciyorsa "hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        String calisilacakCumle= girilenCumle.toLowerCase();

        if (calisilacakCumle.contains("is")&& calisilacakCumle.contains("ev")){
            System.out.println("hem ev lazim hem is");
        } else if (calisilacakCumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (calisilacakCumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");

        }
    }
}
