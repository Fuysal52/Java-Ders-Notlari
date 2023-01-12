package Ders11_ForLoop;

public class C13_NestedForLoop {
    public static void main(String[] args) {

        // input degerine kadar her satirda *  sayisini bir artirip sonra azlatarak yazdirin

        int input= 3;

        for (int i = 1; i <=input; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=input-1; i++) {

            for (int j = input-1; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
