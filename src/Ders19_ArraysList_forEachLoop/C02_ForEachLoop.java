package Ders19_ArraysList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        int [] arr = {2,4,6,8,1};

        // array in tum elemenlerini yazdiralim

        for (int each:arr
             ) {
            System.out.print(each + " ");
        }
        System.out.println("");
        // tum elementleri toplayalim

        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Sayilarin toplami: " + toplam);

        // tum sayilarin karelerini topla

        toplam=0;

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Sayilarin kareleri toplami :" + toplam);
    }

}
