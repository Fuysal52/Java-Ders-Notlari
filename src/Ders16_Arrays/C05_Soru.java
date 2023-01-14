package Ders16_Arrays;

import java.util.Arrays;

public class C05_Soru {
    public static void main(String[] args) {

        // Verilen bir String array'de
        // Istenen bir harfi iceren kelimeleri silip , yerine null yazdirin

        String[] isimler = { "Huseyin", "Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf = "u";
        System.out.println(Arrays.toString(isimler).replace("u", "null"));
                                                                 // [Hnullseyin, Ynullsnullf, Mehmet, Akile, Said]

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].contains(silinecekHarf)) {
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler)); // [null, null, Mehmet, Akile, Said]


    }
}
