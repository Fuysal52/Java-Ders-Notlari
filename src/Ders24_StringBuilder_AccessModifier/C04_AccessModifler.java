package Ders24_StringBuilder_AccessModifier;

public class C04_AccessModifler {

    String str;

    // Access modifler'i gozlerimiz ile goremiyorsak
    // default access modifler vardir

    // bu class da default constructir var
    // str'in degeri null (default deger)
    // str'in access modifler'i default access modifier
    public static void main(String[] args) {

        D obj1 = new D();
        System.out.println(obj1.isimDefault); // Furkan
        obj1.defaultStataicOlmayanMethod();
        // default access modifier'li static method calisir

        // baska class'lardaki class uyelerine erisimde
        // access modifler ve static keyword'u dikkate alinmalidir
        // static class uyelerini obje uzerinden kullanmaya gerek yok
        // illa da obje uzerinden kullanmak isterseniz
        // class uyesinin ismini yazmaniz gerekir

        System.out.println(obj1.isimDefaultStatic); // Sevilay
        System.out.println(D.isimDefaultStatic); // Sevilay

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();
        // DEFAULT access modifier'li static method calisti

    }
}
