package Ders19_ArraysList_forEachLoop;

public class C05_Soru {
    public static void main(String[] args) {

        //  Kullanicidan bir harf ve cumle alin
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin
        // kullanilmamissa "Harf cumlede kullanilmamis"y

        String cumle = "Java ogrenmek cok guzel";
        String harf ="a";

        String [] cumleArr = cumle.split("");

        int sayac = 0;

        for (String eachHarf:cumleArr
             ) {
            if (eachHarf.equals(harf)){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("Harf cumlede kullanilmamis");
        } else {
            System.out.println(harf + " cumlede " + sayac + " defa kullanilmis");
        }
    }
}
