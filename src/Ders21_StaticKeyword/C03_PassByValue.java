package Ders21_StaticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s =20;
        System.out.println(s); // 20

        // int s = 30;
        // bir schope da tanimlanan variable'in yeniden tanimlanma imkani yoktur
        method1();
    }

    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s); // Hasan
    }

    public static void method2 (int s){

        s=s*s;
        System.out.println(s);
    }
}
