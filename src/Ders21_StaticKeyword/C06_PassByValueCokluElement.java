package Ders21_StaticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        // bir method olustrun
        // method da array 5 elementli yeni bir array atayin ve yazdirin
        // main methoda dondukten sonra yine arr'yi yazdirin

        int[] arr = { 3,6,8};
        arrayiDegistir(arr);
        System.out.println(Arrays.toString(arr)); // [3, 6, 8]

    }
    public static void arrayiDegistir (int[] b){
        b=new int [5];
        System.out.println(Arrays.toString(b)); // [0, 0, 0, 0, 0]
    }
}
