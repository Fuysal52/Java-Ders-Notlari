package Ders19_ArraysList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ArradenListYapma {
    public static void main(String[] args) {

        // verilen bir array'i liste cevirmek icin 2 yontem vardir
        // 1- bir loop ile tum elementleri list'e kopyalamak

        int[] arr = {2,3,4,6,3,4,6,1,8,5,4,};

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            list1.add(arr[i]);
        }
        System.out.print("loop ile tasinan list :" + list1 );

        // 2- yontem asList() kullanmak ama tavsiye etmiyoruz. cunku 2 buyuk dezavantaji var
        // a- add ve remove gibi size i etkileyen methodlar kullanmiyorsunuz
        // b - asList ile olusturlan list ile bagli oldugu array birbirinden ayril miyr.
        // birinde yapilacak degisiklik digerini etkiliyor


        // List<Integer> list2 = Arrays.asList(arr);


    }
}
