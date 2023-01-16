package Ders16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1= {1,2,3};

        // aar1 = { 3,6,7,8}; java bu sekilde daha fazla element veya ayni sayida elementi kabul etmez
        // aar1 = { 1,5,6};

        // aar1 = new int[5];
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        // 14. cu satirdaki atama ile java arr1'in pointer'ini eski array'den silip
        // new keyword'u ile olusturdugumuz yeni array'e yonlendirir

        // eski elementleri de korumak istersek. ne yapmaliyiz
        // atama yapmadan once yeni bir array olusturmalioyiz
        // bunun icin bos bir yeni array olusturup
        // eski array'deki elementleri yeni array'e tasiyip
        // sonra atama yapabiliriz

        int[] temp = new int[5];

        for (int i = 0; i <arr1.length ; i++) {

            temp[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]
    }
}
