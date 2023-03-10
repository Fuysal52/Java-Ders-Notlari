package Ders22_ImmutableClasses_DateTime;

import java.util.Arrays;

public class C01_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";

        System.out.println(str.toUpperCase()); // JAVA

        str.toLowerCase();
        System.out.println(str); // Java

        // String immutable oldugundan, method'lar kalici degisiklik yapmaz

        int[] arr = {3,5,9};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [3, 5, 9]

        // Array mutable bir class oldugu icin method ile yaptigimiz degisiklik kalici olur

    }
}
