package Ders11_ForLoop;

import java.util.Scanner;

public class C09_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir String alin
        // String'i ters yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle veya kelime giriniz");
        String giris= scan.nextLine();
        String tersGiris= "";

        for (int i = giris.length()-1; i >=0 ; i--) {
            tersGiris+=giris.charAt(i);
            // tersGiris+=giris.substring(i,i+1);  // buda olur

        }
        System.out.println(tersGiris);
    }
}
