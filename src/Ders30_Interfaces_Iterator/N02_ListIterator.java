package Ders30_Interfaces_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        // tum elementleri index kullanmadan 3 artirin
        System.out.println(sayilar);

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi = (Integer) lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);

        // listeyi iterator kullanarak tum elemenleri sondan basa yazdirin
        // bir ustteki loop ile sona gittigimiz icin suan en sonda.

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        }


    }
}
