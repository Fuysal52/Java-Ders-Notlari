package Ders14_DoWhileLoop_Scope;

public class C05_Schope {

    int sayi=10;
    static int number ;

    public static void main(String[] args) {
        String mainStr = "Java";
        number=10;
        // sayi=20;
        // System.out.println(method2Str);

        for (int i = 0; i <10 ; i++) {
            int toplam = i;
        }
        // System.out.println(toplam);
        // System.out.println(i);
    }
    public static void method1() {
        String method1Str = "Guzeldir";
        number=20;
        // System.out.println(mainStr);
        // System.out.println(method2Str);
    }
    public void method2 (){
        String method2Str = "Candir";
        number =30;
        // System.out.println(mainStr);
    }
}