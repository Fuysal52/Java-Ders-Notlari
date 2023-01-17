package Ders17_Arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        int[] arr = {2,8,4,1,9,3,6};

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,2)); // 1

        // olmayan bir element aradigimizda ne olur?

        System.out.println(Arrays.binarySearch(arr,0)); // -1
        System.out.println(Arrays.binarySearch(arr,5)); //  -5
        System.out.println(Arrays.binarySearch(arr,18)); // -8





    }
}
