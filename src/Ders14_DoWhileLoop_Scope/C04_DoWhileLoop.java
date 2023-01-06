
package Ders14_DoWhileLoop_Scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir sayi isteyiniz
        // sayinin tam kare olup olmadigini bulunuz
        // tam kare ise true degilse false yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif sayi giriniz");
        int girilenSayi = scan.nextInt();
        int karakok = 1;
        boolean sonuc = false;

        do {
            if (karakok * karakok == girilenSayi) {
                System.out.println("Girilen sayinin karakoku :" + karakok);
                sonuc = true;
                break;
            } else {
                karakok++;
            }
        } while (karakok * karakok <= girilenSayi);

        System.out.println(sonuc);

    }

}




