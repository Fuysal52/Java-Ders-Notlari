package Ders18_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); // [A, Z, T]

        // 2. index'e F elementini ekleyin
        // add method'u var olan bir elementi silmeden istedigimiz elementi ekler, kalanlari kaydirir

        harfler.add(2,"F");
        System.out.println(harfler); // [A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler); // [A, Z, M, T]

        // set method'u var olan elementin degerini gunceller
        // eleman sayisini artirmaz
    }
}
