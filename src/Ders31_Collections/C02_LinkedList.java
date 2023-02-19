package Ders31_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {

        // List data turunde bir linked list olusturalim

        List<String> harfler = new LinkedList<>();

        harfler.add("H");
        harfler.add("K");

        System.out.println(harfler); // [H, K]

        harfler.add("H");
        System.out.println(harfler); // [H, K, H]

        // 1. index'e N ekleyelim

        harfler.add(1,"N");
        System.out.println(harfler); // [H, N, K, H]

        // 2. index teki K'YI l yapalim

        harfler.set(2,"L");
        System.out.println(harfler); // [H, N, L, H]

        List<String> karakterler = new LinkedList<>();

        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"N");

        System.out.println(karakterler); // [*, #, N, 9]

        System.out.println(harfler.retainAll(karakterler)); // true
        System.out.println(harfler); // [N] ortak elementler disindaki herseyi sildi

        harfler.addAll(karakterler);
        System.out.println(harfler); // [N, *, #, N, 9]

        System.out.println(harfler.removeAll(karakterler)); // true
        System.out.println(harfler); // []

        System.out.println(karakterler.subList(1, 3)); // [#, N]
        System.out.println(karakterler); // [*, #, N, 9]

        System.out.println(karakterler.hashCode()); // 2210853

    }
}
