package Ders17_Arrays;

import java.util.Arrays;

public class C07_MDA {
    public static void main(String[] args) {

        // Verilen 2katli bir array'de her bir ic array'deki elementleri toplayip
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayalim

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[] toplamlarArrayi = new int[arr.length];
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];
            }
            toplamlarArrayi[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));
    }
}
