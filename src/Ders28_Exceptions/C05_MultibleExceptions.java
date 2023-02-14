package Ders28_Exceptions;

import java.util.Scanner;

public class C05_MultibleExceptions {
    public static void main(String[] args) {

        /*
        eger birden fazla exception olusma ve birbirinden bagimsiz ise
               1- tek try istenen kadar catch yapabiliriz
               2- ikisi icin ic ice try-catch yapabiliriz
               3- iki exception'i da kapsayan tek bir catch yapabiliriz

         */

        String str = "Java'da cok fazla exception var";

        int[] arr = {3,5,1,3,2,6,3,6,8,5,2};

        // Kullanicidan bir tamsayi alin
        // ve girilen sayiyo index olarak kullanip
        // str ve arr'den o index'deki elementleri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index girin");
        int index = scan.nextInt();

        //System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
        //System.out.println("Arry'deki istenen index'deki element: " + arr[index]);

        /* 1.cozum: tek try istenen kadar catch

        try {
            System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
            System.out.println("Arry'deki istenen index'deki element: " + arr[index]);

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("istenen index String'in sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Istenen index Arry'in disinda");
        }
        */
        // 2. cozum : ic ice try catch

       /* try {
            try {
                System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
                System.out.println("Arry'deki istenen index'deki element: " + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("istenen index String'in sinirlari disinda");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istenen index Arry'in disinda");
        }

        */

        // 3. cozum : iki exception'i da kapsayan tek bir catch

        try {
            System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
            System.out.println("Arry'deki istenen index'deki element: " + arr[index]);

        }catch (RuntimeException e){
        System.out.println("Index String ve/veya Arry sinirlari disinda");
        e.printStackTrace();
        }
    }
}
