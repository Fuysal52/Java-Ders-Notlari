package Ders22_ImmutableClasses_DateTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman = LocalTime.now();
        System.out.println(zaman); // 19:49:27.698167900 == saat dk sn nano

        System.out.println(zaman.getMinute()); // 51
        System.out.println(zaman.withSecond(0).withNano(0)); // 19:51
        System.out.println(zaman.withSecond(1).withNano(1)); // 19:51:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250)); // 04:02:31.386834

        // bi for loop ile 1'den 10000'e kadar olan sayilari yazdirin
        // bu islem icin gecen zamani bulun


        LocalTime basZamani = LocalTime.now();
        System.out.println("baslangic : " + basZamani);
        for (int i = 1; i <=10000 ; i++) {


            System.out.print(i+ " ");
        }
        LocalTime bitZamani = LocalTime.now();
        System.out.println("");
        System.out.println("bitis : " + bitZamani);

        System.out.println("Islem suresi : " + (bitZamani.getNano()-basZamani.getNano()) + " nano saniye");
    }
}
