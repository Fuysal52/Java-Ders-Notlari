package Ders31_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {

        // Deque double ended queue demektir
        // iki yonlu kuyruk
        // bu iki yonlu yapisindan dolayi first ve last versiyonu vardir

        Deque<String> harfler = new LinkedList<>();

        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler); // [J, L]
        harfler.addFirst("B");
        System.out.println(harfler); // [B, J, L]

        System.out.println(harfler.removeFirst()); // B
        System.out.println(harfler); //  [J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");

        System.out.println(harfler); // [A, J, L, A, K]

        // son A yi sil

        System.out.println(harfler.removeLastOccurrence("A")); // true
        System.out.println(harfler); // [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T")); // false

    }
}
