package Ders32_Sets_Maps;

import java.util.Map;

public class C07_SoyIsimleOgrenciArama {

    // ogrenci map de aradigimiz soyisimdeki ogrencilerin
    // ISIM,SOYISIM,SINIF VE SUBE bilgilerini tablo olarak yazdiran bir method olusturun
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyIsimleOgrenciListesiYazdirma(ogrenciMap,"Cem");

    }
}
