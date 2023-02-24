package Ders32_Sets_Maps;

import java.util.HashSet;
import java.util.Set;

public class C02_HashSetMethodlari {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Sevilay");
        set1.add("Remzi");
        set1.add(null);
        set1.add("Ali");

        System.out.println(set1); // [null, Sevilay, Remzi, Ali]

        set1.add(null);
        System.out.println(set1); // [null, Sevilay, Remzi, Ali]
    }
}
