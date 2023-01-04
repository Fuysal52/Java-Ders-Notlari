package Ders11_ForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakter yazdrn

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print( (char)(girilenKarakter+i) +" ");
       }
    }
}
