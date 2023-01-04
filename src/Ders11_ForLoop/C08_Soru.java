package Ders11_ForLoop;

public class C08_Soru {
    public static void main(String[] args) {

        // verilen input degerinin faktoriyel degerini hesaplayiniz ve
        // 5!=5*4*3*2*1=120 seklinde yazdirin

        int input= 6;
        int carpim=1;

        System.out.print(input + "!=" );

        for (int i = input; i >=2 ; i--) {
            System.out.print(i+ "*");
            carpim*=i;
        }
        System.out.println("1="+carpim);
    }
}
