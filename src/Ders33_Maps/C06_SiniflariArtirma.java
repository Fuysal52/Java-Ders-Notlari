package Ders33_Maps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {

        // Ogrenci map'deki tum sinif degerlerini bir artirin
        // 12. sinifta olan varsa sinif bilgisini mezun yapin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
