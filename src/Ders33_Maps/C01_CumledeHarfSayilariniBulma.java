package Ders33_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {

        // verilen bir cumlede kullanilan harf sayilarini ve kacar tane oldu bulma
        // java candir
        // output : j=1, a=3, v=1, n=1, c=1 , d=1, i=1, r=1

        String cumle = "Java candir";

        // oncelikle bosluK ve ozel karakterleri yok edelim

        cumle=cumle.replaceAll("\\W",""); // Javacandir

        String[] cumleArr = cumle.split("");  // [J, a, v, a, c, a, n, d, i, r]

        Map<String,Integer> kullanimSayilariMap = new HashMap<>();

        for (int i = 0; i <cumleArr.length ; i++) {

            // her bir elementi ele alip
            // map'de key olarak yoksa value=1 olarak ekleriz
            // map'de key olarak varsa value 1 artirilmalidir

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);
            } else {
                int eskiValue = kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }
        }
        System.out.println(kullanimSayilariMap);
    }

}
