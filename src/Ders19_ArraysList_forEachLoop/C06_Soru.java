package Ders19_ArraysList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        // Verilen iki arrayin elementlerini karsilastirip
        // ikisinde ortak olan elementleri ayri bir liste olarak verilen bir program yazin

        int [] arr1 = {3,5,6,1,3,7};
        int [] arr2 = {3,8,9,4,5,11};

        List<Integer> ortakElementler = new ArrayList<>();

        for (int eachHarf1:arr1
             ) {
            for (int eachHarf2:arr2
                 ) {
                if (eachHarf1==eachHarf2){
                    if (!ortakElementler.contains(eachHarf1)){

                        ortakElementler.add(eachHarf1);
                    }
                }
            }
        }
        System.out.println(ortakElementler);
    }
}
