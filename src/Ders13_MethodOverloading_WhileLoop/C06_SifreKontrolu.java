package Ders13_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin asagidaki sartlari kontrol edip ve kullaniciya duzeltmesi gereken
        // tum eksikleri soyleyin
        // eger tum sartlar basariyla saglaniyorsa "sifre basariyla kaydedildi"yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        // sifre kontrolunu bir method'da yapip true/ false dondurun
        // main method'da donen sonucu kontrol edip
        // "basari ile olusturuldu"yazincaya kadar sifreyi tekrar tekrar isteyin

        Scanner scan=new Scanner(System.in);

        boolean tekrarSifreIste = true;
        String sifre = "";

        while (tekrarSifreIste){
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();

            if (sifreKontrolEt(sifre)){
                System.out.println("Basari ile olusturuldu");
                tekrarSifreIste=false; // veya break de yazabilirsin.
            }
        }
    }


    public static boolean sifreKontrolEt (String sifre){
        int flag=0;


        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }

        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("Son karakter rakam olmali");
            flag++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }

        if (!(sifre.length()>=10)) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag==0){
            return true;
        } else  {
            return false;
        }
    }
}
