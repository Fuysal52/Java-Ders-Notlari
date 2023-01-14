package Ders16_Arrays;

public class C06_Soru {
    public static void main(String[] args) {

        // Verilen bir array'deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yazdirin

        int[] sayilar = { 3,7,1,9,-11,-50};
        System.out.println(pozitifSayilarToplami(sayilar)); // 20

    }

    public static int pozitifSayilarToplami(int[] arr ) {

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0) {

                toplam+=arr[i];
            }
        } return toplam;
    }
}
