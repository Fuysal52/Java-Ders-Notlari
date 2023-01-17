package Ders18_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        harfler.remove("Z"); // true === boolean sonuc dondurur. Z 'yi bulur ve siler
        System.out.println(harfler); //  [A, T]

        harfler.remove(0); // A == 0. index'i siler ve silinen elementi bize donduru
        System.out.println(harfler); //  [T] == A'yi silip yazdirir

        List<String> yeniList = new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));

        // harfler listesindeki tum elementleri yeniList'ten siler
        // gorevi tamamlarsa true, yoksa false doner

        System.out.println(yeniList); // [C, D] == harfler listesinde olup burda olan T'yi sildi

    }
}
