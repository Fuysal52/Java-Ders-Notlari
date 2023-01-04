package Ders09_StringManipulations2;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        // kullanicidan aldigimiz cumle "cok"ile baslayan ilk kelimeyi yazdirin
        // Cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        if (!girilenCumle.contains("cok")) {
            System.out.println("cumlede cok ile baslayan kelime yok");
        } else {

            int cokIndexi = girilenCumle.indexOf("cok");
            int boslukIndexi = girilenCumle.indexOf(" ", cokIndexi + 1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }
    }
}