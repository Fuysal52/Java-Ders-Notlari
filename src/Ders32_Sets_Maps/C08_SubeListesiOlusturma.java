package Ders32_Sets_Maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {

        // verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturn
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap, "10","k");
    }
}
