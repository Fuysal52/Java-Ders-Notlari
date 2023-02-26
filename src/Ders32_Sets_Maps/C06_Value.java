package Ders32_Sets_Maps;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        // Map olustur method'u bize bir map donduruyor.
        // biz o class'daki map'i kullanmak istiyoruz ama
        // her seferinde o class'a gidip o map'i yeniden olusturmamiz isimiz yaramaz.

        // bu class da bir map olusturmak istedigimizde
        // new Hash<>() yaziyoruz ama bu bize bos bir map getiriyor.
        // bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur method'unu calsitirisak
        // bize dolu bir map getirir
        // bizde onu icinde oldugumuz calss'da olusturdugumuz ogrenciMap'a atama yapariz

        Map<Integer,String> ogrenciMap =MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Oz-12-M-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]
        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Oz-12-M-MF]

        // verilen ismin ogrenci map de olup olmadigini kontrol edip
        // true veya false donen bir method olusturun

        boolean sonuc = MapMethodDepo.isimleOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc); // true
        System.out.println(MapMethodDepo.isimleOgrenciArama(ogrenciMap,"Kemal")); // false




    }
}
