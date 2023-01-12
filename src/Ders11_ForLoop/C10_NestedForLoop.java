package Ders11_ForLoop;

public class C10_NestedForLoop {
    public static void main(String[] args) {

        // verilen input a gore carpim tablosu olusturun
        int input = 4;

        for (int i = 1; i <=3 ; i++) {  // outer denir ve i'nin carpilacagi sayiyi kontrol eder

            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j + " "); // inter denir.

            }
            System.out.println("");
        }
    }
}
