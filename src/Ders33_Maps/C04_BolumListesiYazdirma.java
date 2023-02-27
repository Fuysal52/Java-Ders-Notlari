package Ders33_Maps;

import Ders32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {

        // verilen bolumdeki ogrencilerin
        // no isim soyisim ve siniflarini yazdiran method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");
    }
}
