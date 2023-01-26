package Ders21_StaticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {

        // bir method olusturup, arr'yi method'a yollayalim
        // method'da arr'nin elementleri uzerine degisiklik yapalim ve arr'yi yazdiralim

        int[] arr = {3,6,9,1,7};
        elementleriDegistir(arr);
    }

    public static void elementleriDegistir (int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b)); // [13, 6, 19, 1, 7]
    }
}
