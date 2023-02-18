package Ders30_Interfaces_Iterator;

public interface I01_Interface {

    int SAYI=10;
    public static final String OKUL_ISMI = "Yildiz koleji";
    public int SAYI2 = 20;


    void method1();
    public int method2();
    abstract String method3();
    public abstract void method();
    void method5();

    public default void method44(){
        System.out.println("Interface'deki default olarak isaretlenen method calisti");
    }
    public static void method34(){
        System.out.println("Interface'deki default olarak isaretlenen method calisti");
    }




}
