package Ders32_Sets_Maps;

import java.util.*;

public class MapMethodDepo {

        // bize ogrenci map donduren bir method olusturun

    public static Map<Integer,String>  ogrenciMapOlustur (){

        Map<Integer,String> ogrenciMap = new HashMap();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'lari bir collection olarak kaydedelim

        Collection<String> valuesCollection = ogrenciMap.values();

        // 2-for-each kullanarak her bir value'yu ele alalim.  [Ali-Can-11-H-MF]
        // 3- -'yi kullanrak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim. (0.index)
        // 5- eger value den aldigimiz isim aranan isim ise true dondurun donguyu bitireli
        // 6- for-each bittiginde true olmadiysa false dondurelim

        for (String eachValue:valuesCollection
             ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }
        return false;
    }

    public static void soyIsimleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyIism) {

        // 1- map deki value leri bir collection olarak kaydedelim

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        // Listenin ilk satiri olarak basliklari yazdiralim

        System.out.println("Isim Soyisim Sinif Sube");

        // 2- her bir value yu for each ile ele alalim
        // 3- value'yu - ile split yapip bir array elde edelim
        // 4- array'in 1. index'indeki soyisme bakip, aranan soyisim ile ayni ise
        //    isim, soyisim,sinif ve sube bilgilerini yazdiralim

        for (String eachValue:ogrenciValueCollection
             ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyIsim = valueArr[1];

            if (valueSoyIsim.equalsIgnoreCase(soyIism)){
                System.out.println(valueArr[0] + " "+
                                   valueArr[1] + " "+
                                    valueArr[2]+ " "+
                                     valueArr[3]);
            }
        }
    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim Soyisim");

        for (String eachValue:valueCollection
             ) {
            String[] valueArr = eachValue.split("-");

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String>  numaraIleOgrenciSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // 1- okul numarasini biliyoruz. direkt ogrenci value ya ulasabiliriz

        String ogrenciValue = ogrenciMap.get(okulNo);   // Ayse-Can-10-H-MF

        String[] valueArr = ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 2- SUBE ISMINI GUNCELLEYELIM

        valueArr[3]=yeniSubeIsmi; // [Ayse, Can, 10, M, MF]

        // 3- ARRAY'DEKI GUNCEL BILGILERI YENIDEN VALUE FORMATINA SOKALIM

        String yeniValue=valueArr[0]+ "-"+valueArr[1]+ "-"+valueArr[2]+ "-"+valueArr[3]+ "-"+valueArr[4];

        // 4- ogrenci no key ile yeni value yu map'e ekleyelim

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        System.out.println("No isim soyisim bolum");
        System.out.println("======================");

        Set<Map.Entry<Integer,String>> entrySeti =ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            // 1- entry den value yu alalim
            String entryValue = eachEntry.getValue();

            // 2- bu value'yu parcalayalim ve bir array e store edelim

            String[] valueArr = entryValue.split("-");

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)){

                System.out.println(eachEntry.getKey() + " " +
                                   valueArr[0] + " " + valueArr[1] + " "+
                                    valueArr[4]);
            }
        }
    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {

        System.out.println("No isim soyisim sinif");
        System.out.println("=====================");


        Set<Map.Entry<Integer,String>> entrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySet
             ) {
            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            if (entryValueArr[4].equalsIgnoreCase(bolum)){

                System.out.println(eachEntry.getKey() + " " + entryValueArr[0]+ " " +
                                   entryValueArr[1] + " " + entryValueArr[2]);

            }
        }
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soyisimleri buyuk harf yapalim
        // 1- entrySet olusturalim

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();

        // 2 - foreach ile her bir entry i elden gecirip soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer,String> eachEntry:entrySeti ) {

            // 3- entyr'den value'yu alalim
            String entryValue = eachEntry.getValue();
            // 4- soyisim bilgisine ulasip degistirebilmek icin parcala
            String[] entryValueArr = entryValue.split("-");

            // 5-soyisim buyuk harf yapma
            entryValueArr[1]=entryValueArr[1].toUpperCase();

            // 6- degisikligi yaptiktan sonra birlestirmeler yapip map'i update yapmaliyiz

            // 7- setValue() kullanarak value'yu yeni haline update edelim

            eachEntry.setValue(entryValueArr[0]+"-"+
                               entryValueArr[1]+"-"+
                               entryValueArr[2]+"-"+
                               entryValueArr[3]+"-"+
                               entryValueArr[4]);
        }
        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer,String> ogrenciMap) {
        Set<Map.Entry<Integer,String>> ogrenciEntrySet = ogrenciMap.entrySet();

        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachtEntry:ogrenciEntrySet
        ) {
            System.out.println(eachtEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry :entrySeti) {

            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            int sinifInt = Integer.parseInt(entryValueArr[2]);

            if (sinifInt == 12) {

                entryValueArr[2] = "Mezun";
            } else {
                entryValueArr[2] = sinifInt + 1 + "";
            }
            eachEntry.setValue(entryValueArr[0] + "-" +
                               entryValueArr[1] + "-" +
                               entryValueArr[2] + "-" +
                               entryValueArr[3] + "-" +
                               entryValueArr[4]);
        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();

        for (Map.Entry<Integer,String> eachEntry :entrySeti) {

            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu string 'leri sirali olarak yazdiracagz

            String istenenFormattakiBilgi = entryValueArr[2]+ " " +
                                            entryValueArr[3]+ " " +
                                            entryValueArr[0]+ " " +
                                            entryValueArr[1]+ " " +
                                            eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }
        System.out.println("Sinif sube isim soyisim no");
        System.out.println("==========================");

        for (String each:siraliOgrenciSeti) {
            System.out.println(each);
        }
    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> entrySeti = ogrenciMap.entrySet();
        Set <String> isimSoyisimSiraliSet = new TreeSet<>();

        for (Map.Entry<Integer,String>eachEntry:entrySeti) {

            String value = eachEntry.getValue();

            String[] valueArr = value.split("-");

            String istenenFormattakiBilgi = valueArr[0]+" " + valueArr[1]+" " +
                                            eachEntry.getKey() + " " +
                                            valueArr[2]+" " +valueArr[3]+" " +valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);
        }
        System.out.println("Isim soyisim no sinif sube bolum");
        System.out.println("================================");

        for (String each:isimSoyisimSiraliSet) {

            System.out.println(each);
        }
    }
}
