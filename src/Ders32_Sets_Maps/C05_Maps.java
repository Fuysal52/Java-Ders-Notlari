package Ders32_Sets_Maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF}
        System.out.println(ogrenciMap.size()); // 4

        // map de 103 nolu ogrenci var mi?

        System.out.println(ogrenciMap.containsKey(103)); // true

        // ali diye ogr  var mi?

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

    }
}
