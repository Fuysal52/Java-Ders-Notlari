package Ders11_ForLoop;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // 1'den baslayarak tum sayilari yazdirin . sira
        // - 3 ile bolunebilen bir sayiya gelirse , sayi yerine fizz
        // - 5 ile bolunebilen bir sayiya gelirse, sayi yerine buzz
        // - hem 3 hem de 5 ile bolunebilen bir sayiya gelirse fizzBuzz yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {

            if (i%3==0 && i%5==0) {
                System.out.println("fizzBuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

