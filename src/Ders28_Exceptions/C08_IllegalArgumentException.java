package Ders28_Exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentException {
    public static void main(String[] args) {

        // kullanicidan yasini girmesini isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();


        }
    }
}
