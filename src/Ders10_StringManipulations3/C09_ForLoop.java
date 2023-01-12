package Ders10_StringManipulations3;

public class C09_ForLoop {
    public static void main(String[] args) {

        // 1 ile 1000 arasindaki sayilari yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum sayilarin toplami" deyip sayilarin toplamini yazdirin

        int sayilarinToplami=0;

        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i + " ");
            sayilarinToplami +=i;
        }
        System.out.println("");
        System.out.println("Tum sayilarin toplami = " + sayilarinToplami);
    }
}
