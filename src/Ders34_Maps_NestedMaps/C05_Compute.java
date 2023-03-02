package Ders34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfSayilariMap = new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",5);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); // {A=10, C=5, D=3, K=5}

        // A'nin kullanim miktarini 20 yapin
        harfSayilariMap.put("A",20);

        // c'nin kullanim miktarini 2 katina cikarin

        harfSayilariMap.put("C",harfSayilariMap.get("C")*2);

        System.out.println(harfSayilariMap); // {A=20, C=10, D=3, K=5}

        // D'NIN miktarini 5 artirin

        harfSayilariMap.compute("D", (k,v) ->v+5);
        System.out.println(harfSayilariMap); // {A=20, C=10, D=8, K=5}

        // eger map'de T varsa kullanim miktari 3 eksiltin

        harfSayilariMap.computeIfPresent("T", (k,v) -> v-3);
        System.out.println(harfSayilariMap); // {A=20, C=10, D=8, K=5}

        // K harfi varsa kullanimini 2 azalt

        harfSayilariMap.computeIfPresent("K", (k,v) ->v-2);
        System.out.println(harfSayilariMap); // {A=20, C=10, D=8, K=3}

        // T harfi yoksa kullanim miktarini 3 olarak ekleyin

        harfSayilariMap.computeIfAbsent("T", v->3);
        System.out.println(harfSayilariMap); // {A=20, C=10, D=8, K=3, T=3}

    }
}
