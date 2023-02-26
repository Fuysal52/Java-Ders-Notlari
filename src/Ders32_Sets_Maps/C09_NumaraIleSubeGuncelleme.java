package Ders32_Sets_Maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {

        // numarasi verilen ogrencinin sube ismini verilen sube yapan bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleOgrenciSubeDegistirme(ogrenciMap,104,"M");
        ogrenciMap=MapMethodDepo.numaraIleOgrenciSubeDegistirme(ogrenciMap,101,"L");

        System.out.println(ogrenciMap);
    }
}
