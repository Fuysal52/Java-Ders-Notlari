package Ders34_Maps_NestedMaps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.getOrDefault(123,"ogrenci bulunamadi")); // ogrenci bulunamadi
        System.out.println(ogrenciMap.get(123)); // null

        ogrenciMap.replace(103, "Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-MF

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-12-K-MF

        ogrenciMap.replace(123, "Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(123)); // null

        ogrenciMap.put(123, "Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(123)); // Ali-Cem-11-K-MF

        ogrenciMap.replace(103,"Ali-Cem-12-K-MF","Ali-Han-12-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF
    }
}
