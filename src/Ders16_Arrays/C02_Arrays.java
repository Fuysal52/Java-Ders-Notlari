package Ders16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr1 = new String[4];

        int [] arr2 = {3,4,5,6,7,8};

        System.out.println(arr2[2]); // 5
        System.out.println(arr2[arr2.length-1]);
        System.out.println(arr1[3]); // null === suan deger atamadigimiz icin arr1 in butun degerleri null'dur
        // System.out.println(arr1[8]); // uzunluk 4 oldugu icin 8. element olmadigindan hata verir

        // array'in tamammini yazdirma

        System.out.println(Arrays.toString(arr2)); // [3, 4, 5, 6, 7, 8]
        System.out.println(Arrays.toString(arr1)); // [null, null, null, null]

        // array'in bir elementini degitirme

        arr2[2]=15;
        System.out.println(arr2[2]); // 15


    }
}
