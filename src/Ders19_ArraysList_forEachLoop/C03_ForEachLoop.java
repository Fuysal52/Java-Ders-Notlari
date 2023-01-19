package Ders19_ArraysList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // Arraydeki tum elementleri liste kopyalayalim

        int[] arr = {2,3,4,6,3,4,6,1,8,5,4,};

        List<Integer> list1 = new ArrayList<>();

        for (Integer each:arr
             ) {
            list1.add(each);
        }
        System.out.println(list1);

        // Olusturacagimiz listeye arraydeki cift sayilari tasiyalim

        List<Integer> ciftSayilarList = new ArrayList<>();

        for (Integer each:arr
             ) {
            if (each%2==0){
                ciftSayilarList.add(each);
            }
        }
        System.out.println(ciftSayilarList);
    }
}
