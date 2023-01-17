package Ders18_ArrayLists;

import Ders16_Arrays.C09_ArrayeBirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayLists {
    public static void main(String[] args) {

        String [] arr = {"A","B","T"};

        arr=C09_ArrayeBirElementEkleme.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr)); // [A, B, T, C]

        List<String> harfler = new ArrayList<>();
        System.out.println(harfler); // []
        harfler.add("A");
        harfler.add("B");
        harfler.add("T");
        harfler.add("K");
        System.out.println(harfler); // [A, B, T, K]

        harfler.add(2,"D");
        System.out.println(harfler); // [A, B, D, T, K]

        List<String> karakterler = new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");

        harfler.addAll(karakterler);
        System.out.println(harfler); // [A, B, D, T, K, *, #]
        harfler.addAll(2,karakterler);
        System.out.println(harfler); // [A, B, *, #, D, T, K, *, #]


    }
}
