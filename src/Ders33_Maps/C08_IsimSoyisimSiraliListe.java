package Ders33_Maps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
