package Ders33_Maps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        // tum ogrenci listesini
        // sinif sube isim soyisim no
        // dogal sirali olarak yazdiran method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);
    }
}
