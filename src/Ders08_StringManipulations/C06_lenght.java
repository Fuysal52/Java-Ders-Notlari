package Ders08_StringManipulations;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {

        // sondan ucuncu karakteri calistirin

        String str= "Java her gecen gun dahada guzellesiyor";
        System.out.println(str.charAt(str.length()-3)); // y
        System.out.println(str.length()); // 38

        // Rastgele bir karakteri yazdiralim

        Random rdm=new Random(); // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturu
        int index= rdm.nextInt(str.length()); // str.lenght ten  kucuk rastgele bir int uretir
        System.out.println(str.charAt(index));

    }
}
