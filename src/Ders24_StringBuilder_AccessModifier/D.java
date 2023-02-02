package Ders24_StringBuilder_AccessModifier;

public class D {

    private String isim="Mustafa";
    String isimDefault = "Furkan";

    static String isimDefaultStatic = "Sevilay";

    public static void main(String[] args) {

       // System.out.println(isim); // static olmadigindan static main method icinden direk kullanilamaz

        D obj1 = new D();
        System.out.println(obj1.isim); // Mustafa

        staticMethod();
        System.out.println(obj1.isim); // Mustafa
    }

    void defaultStataicOlmayanMethod(){
        System.out.println("default access modifier'li static olmayan method calisir");
    }

    static void defaultStaticMethod(){
        System.out.println("default access modifier'li static method calisir");
    }

    private void staticOlmayanMethod (){
        isim="Huseyin";
        System.out.println(isim);
    }
    private static void staticMethod(){
        D obj1 = new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim); // Zafer
    }

    // iki tane obj1 olabilir cunku ikisininde scope'u farkli.
}
