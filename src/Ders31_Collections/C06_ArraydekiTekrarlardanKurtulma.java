package Ders31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        // Verilen bir array deki tekrar eden elemenleri sadece 1 kere yazarak kod yazin

        int[] arr = {1,2,3,5,3,6,5,1,1,2,3,4,5,5,4,3,1};

        Set<Integer> arrSet = new HashSet<>();

        // Array'deki tum elementleri, Set 'e ekleyelim

        for (int each:arr
             ) {
            arrSet.add(each);
        }
        System.out.println(arrSet); // [1, 2, 3, 4, 5, 6] // bu bir array degil set

        // Set'in element sayisina esit bir array olusturun
        // Set'in elementlerini oraya tasiyalim

        arr= new int[arrSet.size()]; // [0, 0, 0, 0, 0, 0]

        int index = 0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
    }
}
