package Ders16_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // Verilen bir int array'deki tum elementleri 5 artirin

        int[] arr = {2,4,6,8 };

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
            System.out.print(arr[i] + " "); // 7 9 11 13
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr)); // [7, 9, 11, 13]
    }
}
