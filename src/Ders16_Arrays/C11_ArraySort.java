package Ders16_Arrays;

import java.util.Arrays;

public class C11_ArraySort {
    public static void main(String[] args) {
        // Verilen bir Array'i natural order'a gore siralama

        String[] isimler = { "Huseyin", "Yusuf","Mehmet","Akile","Said","Mahmut","ahmet"};

        System.out.println(Arrays.toString(isimler)); // [Huseyin, Yusuf, Mehmet, Akile, Said, Mahmut, ahmet]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Akile, Huseyin, Mahmut, Mehmet, Said, Yusuf, ahmet]
    }
}
