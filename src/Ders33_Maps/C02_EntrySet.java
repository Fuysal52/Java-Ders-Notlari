package Ders33_Maps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // tum ogrencileri 101=Ali-11H-MF seklinde yazdirin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        // once ogrenci no lari alalim

        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey:ogrenciNoSeti
             ) {
            System.out.println(eachKey + "=" +ogrenciMap.get(eachKey));
        }

        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachtEntry:ogrenciEntrySet
             ) {
            System.out.println(eachtEntry);
        }
    }
}
