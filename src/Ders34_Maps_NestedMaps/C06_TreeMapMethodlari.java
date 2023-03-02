package Ders34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> harfSayilariMap = new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",5);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); // {A=10, C=5, D=3, K=5}

        System.out.println(harfSayilariMap.subMap("C","F")); // {C=5, D=3}
        System.out.println(harfSayilariMap.subMap("C","K")); // {C=5, D=3} C dahil K degil

        System.out.println(harfSayilariMap.descendingMap()); // {K=5, D=3, C=5, A=10} ters ceviriyor

        System.out.println(harfSayilariMap.lowerKey("E")); // D === kendisinden kucuk en buyuk olani verir
        System.out.println(harfSayilariMap.lowerKey("D")); // C === kendisinden kucuk en buyuk olani verir

        System.out.println(harfSayilariMap.floorKey("E")); // D === kendisi dahil kucuk olanlardan en buyuk olani verir
        System.out.println(harfSayilariMap.floorKey("D")); // D === kendisi dahil kucuk olanlardan en buyuk olani verir

        System.out.println(harfSayilariMap.higherKey("D")); // K === kendisinden buyuk en kucuk olani verir
        System.out.println(harfSayilariMap.ceilingKey("D")); // D == kendisi dahil buyuk olanlardan en kucuk olani verir

        System.out.println(harfSayilariMap); // {A=10, C=5, D=3, K=5}

        System.out.println(harfSayilariMap.headMap("D")); // D den oncesini yazdiri {A=10, C=5} d dahil degil
        System.out.println(harfSayilariMap.tailMap("C")); // {C=5, D=3, K=5} == c 'den sonrasini yazdirir c dahil

        System.out.println(harfSayilariMap.pollFirstEntry()); // A=10=== A yi getirir ve siler
        System.out.println(harfSayilariMap); // {C=5, D=3, K=5}

        System.out.println(harfSayilariMap.pollLastEntry()); // K=5 getirir ve siler
        System.out.println(harfSayilariMap); // {C=5, D=3}
    }
}
