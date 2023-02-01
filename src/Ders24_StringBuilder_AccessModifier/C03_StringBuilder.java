package Ders24_StringBuilder_AccessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");

        StringBuilder sb2 = new StringBuilder("Java");

        String str = "Java";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        // StringBuilder metin esitligini sorgulamak icin equals kullanmaz

        System.out.println(sb1.compareTo(sb2)); // 0 === 0 ise esittir

        StringBuilder sb3 = new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3)); // 2

        sb3=new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3)); // -10 == ilk buldugu farka gore bakar. geri ise - ilerde ise + yapar

        sb3= new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3)); // -1 == fazla karakter sayisini - olarak verir. usteki fazla olsa + olur

        // System.out.println(sb1==str); // data turleri farkli CTE verir

        System.out.println(sb1.equals(str)); // false=== CTE vermiyor fakat false verir
        // System.out.println(sb1.compareTo(str)); // compare Stringbuilder lar arasonda calisir. String kabul etmez

    }
}
