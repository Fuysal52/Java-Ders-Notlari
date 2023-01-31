package Ders23_Varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        // oyle bir method olusturalim ki kac tane argument yazarsam yazalim
        // argumentlerin toplamini versin

        topla (5,7);
        topla(5,8,1);
        topla(1,6,2,9);
        topla(1,7,5,6,8,9,3,3,1);

    }

    private static void topla(int... sayilar) {

        int toplam1=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam1+=sayilar[i];
        }
        System.out.println(toplam1); //

        int toplam2 = 0;

        for (int each:sayilar
             ) {
            toplam2+=each;
        }
        System.out.println(toplam2); //
    }
}
