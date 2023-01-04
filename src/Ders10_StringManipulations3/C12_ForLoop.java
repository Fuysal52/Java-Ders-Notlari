package Ders10_StringManipulations3;

public class C12_ForLoop {
    public static void main(String[] args) {

        //  verilen sayinin faktoriyelini hesaplayiniz

        int input = 5;
        int carpim=1;

        for (int i = input; i >=1 ; i--) {
            carpim*=i;
        }

        System.out.println("Verilen " + input + " sayisinin faktoriyeli : " + carpim);
    }
}
