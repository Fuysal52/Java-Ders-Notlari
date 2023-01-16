package Ders16_Arrays;

import java.util.Arrays;

public class C12_binarySearch {
    public static void main(String[] args) {
        // binary tree javanin kullandigi ozel bir siralama yontemidir

        int[] arr = {2,6,9,3,15,1,7};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 6, 7, 9, 15]
        System.out.println(Arrays.binarySearch(arr,3)); // 2
    }
}
