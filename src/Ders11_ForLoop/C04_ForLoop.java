package Ders11_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen sayidan 1'e kadar olan butun sayilari yazdirin

        int input = 23;

        if (input > 1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = input; i <= 1; i++) {
                System.out.print(i + " ");

            }
        }
    }
}
