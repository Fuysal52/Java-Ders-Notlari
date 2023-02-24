package Ders32_Sets_Maps;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {
    public static void main(String[] args) {

        Set<Integer> sirali = new TreeSet<>();

        sirali.add(13);
        sirali.add(34);
        sirali.add(1);
        sirali.add(153);
        sirali.add(53);

        System.out.println(sirali); // [1, 13, 34, 53, 153]
    }
}
