package Ders09_StringManipulations2;

public class C07_IlkTest {
    public static void main(String[] args) {

        // Gittigimiz web sayfasindan aldigimiz arama sonuclarinda arama sayisinin 50'den fazla oldugunu test edin

        String input= "1-48 of 87 results for \"nutella\"";

        int indexOf= input.indexOf("of");
        int indexResults= input.indexOf("results");

        String sonucSayisiString= input.substring(indexOf+3, indexResults-1);
        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50) {
            System.out.println("Nutella arama testi PASSED");
        } else {
            System.out.println("istene kadar sonuc yok, Nutella arama testi FAILED");

        }
    }
}
