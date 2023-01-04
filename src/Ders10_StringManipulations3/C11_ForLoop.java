package Ders10_StringManipulations3;

public class C11_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplamini yazdirin

        int inputBas = 34;
        int inputBitis = 564;

        int sayac= 0;
        int toplam= 0;

        for (int i = inputBas; i <=inputBitis ; i+=7) {

            System.out.println(i + " ");
            sayac++;
            toplam+=i;
        }

        System.out.println("");
        System.out.println("Toplam " + sayac + " adet sayi var \nBu sayilarin toplami: " + toplam );
    }
}
