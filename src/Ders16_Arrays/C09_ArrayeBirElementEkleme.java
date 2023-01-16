package Ders16_Arrays;

import java.util.Arrays;

public class C09_ArrayeBirElementEkleme {
    public static void main(String[] args) {

        // Verilen bir array'e istenen bir elemani ekleyip bize donduren bir method yazdirin
        // eski array'e yeni degeri atayin

        String[] isimler = {"Ali","Veli","Cem"};
        String eklenecekIsim = "Kemal";

        isimler=arrayeElementEkleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler));

    }

    public static String[] arrayeElementEkleme ( String[] eklenilecekArray, String eklenecekElement){
        String[] temp= new String[eklenilecekArray.length+1];

        for (int i = 0; i <eklenilecekArray.length ; i++) {

            temp[i]=eklenilecekArray[i];
        }
        temp[temp.length-1]=eklenecekElement;
        return temp;
    }
}
