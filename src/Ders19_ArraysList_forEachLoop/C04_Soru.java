package Ders19_ArraysList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Soru {
    public static void main(String[] args) {

        // Verilen bir arraydeki tekrar eden elementleri icin
        // mukerrer olanlari silip tum elemenalrdan sadece 1 tane yapip
        // eski array i yeni haline atayin

        int[] arr = {2,3,4,6,3,4,6,1,8,5,4,};
        List<Integer> list1 = new ArrayList<>();

        for (Integer each:arr
             ) {
            if (!list1.contains(each)) {
                list1.add(each);
            }
        }
        //arr = new Integer[list1.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=list1.get(i);
        }
        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));
    }
}
