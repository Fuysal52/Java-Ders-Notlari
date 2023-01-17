package Ders17_Arrays;

import java.util.Arrays;

public class C08_MDA {
    public static void main(String[] args) {

        // Verilen 2 katli bir array'de ayni index'e sahip elementleri toplayip ,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin

        // dinamik hale getirebilmek icin inner array'lerden en kisasini bulmaliyiz

        int[][]  arr = {{3,4,5},{2,3,4,5},{4,3}};
        int enKisaArrayLengt = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if (enKisaArrayLengt>arr[i].length){
                enKisaArrayLengt=arr[i].length;
            }
        }

        // ayni indexdeki elementleri topladigimizda koyacagimiz tek katli bir array olusturalim

        int[] toplamlarArrayi = new int[enKisaArrayLengt];
        int toplam=0;

        for (int i = 0; i <toplamlarArrayi.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                toplam+=arr[j][i];
            }
            toplamlarArrayi[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));
    }
}
