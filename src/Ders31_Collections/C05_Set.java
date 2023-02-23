package Ders31_Collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {

        // TreeSet sirali olarak ekler

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler); // [Ayten, Esra, Furkan]

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); // [Ayten, Esra, Furkan]

        // onceki furkani siler yenisi ekler

    }
}
