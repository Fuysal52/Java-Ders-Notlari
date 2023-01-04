package Ders11_ForLoop;

public class C14_NestedForLoop {
    public static void main(String[] args) {

        //    *********
        //    ********
        //    *******
        //    ******
        //    ****
        //    ***
        //    **
        //    *    bu sekli yazdirin

        int input= 9;

        for (int i = input; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
     }
}
