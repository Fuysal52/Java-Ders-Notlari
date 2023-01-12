package Ders11_ForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakter yazdrn

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = girilenKarakter; i <=girilenKarakter+10 ; i++) {
            System.out.print( (char)(i) +" "); // a b c d e f g h i j k l... karakterleri yazdirir
            System.out.println(i + " ");  // 97 98 99 100 101 102 103 104 105 106 107 .. sayisal degerleri yazdirin
       }
    }
}
