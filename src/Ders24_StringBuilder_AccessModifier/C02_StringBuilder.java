package Ders24_StringBuilder_AccessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.capacity()); // 16 vardi + 4 = 20 oldu
        System.out.println(sb.length()); // 4

        sb.trimToSize();

        // Atama yapmadigimiz halde bu degisiklik kalici olur mu?
        // SgtringBuilder mutable oldugundan method'larla yapilan degisiklikler kalici olur

        System.out.println(sb.capacity()); // 4

        sb.toString().toUpperCase();
        System.out.println(sb); // Java

        // StringBuilder'i String e cevirirseniz veya string dondurecek methodlar kullanirsaniz
        // String'in immutable ozellihi devreye girer ve yapilan degisiklikler kalici olmaz

        // sb=sb.toString().toString();
        // nonprimitive data turlerinden farkli data turunden atama yapamazsiniz
        // su sekilde yapabiliriz

        StringBuilder sb2 = new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2); // JAVA

        sb=sb2;
        System.out.println(sb); // JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb); // HAVA

        System.out.println(sb.reverse()); // AVAH === ters cevirir

        sb.insert(1,"Y");
        System.out.println(sb); // AYVAH === 1.index e bu harfi yazar digerlerini yana kaydirir

        sb.insert(5," ETME");
        System.out.println(sb); // AYVAH ETME === 5. indexten itibaren bunu ekler

        sb.indexOf("A",3);
        System.out.println(sb); // 4=== 3. index ten sonraki ilk A yi bulur
        System.out.println(sb.indexOf("VAH")); //2 == VAH in indexini bulur . butun olarak dusunur
        System.out.println(sb.lastIndexOf("VAH")); // 2
        System.out.println(sb.lastIndexOf("E",9)); // 9

        sb.replace(5,10," YOK");
        System.out.println(sb); // AYVAH YOK

        sb.delete(4,8);
        System.out.println(sb); // AYVAK === baslangiuc dahil bitis dahil degil

    }
}
