package Ders22_ImmutableClasses_DateTime;

public class C03_StringEquals {
    public static void main(String[] args) {

        // Java her seferinde String lerde yeni obje olusturmamak icin String havuzunu kullanir
        // Eger String olusturulken bugune kadar yaptigimiz sekilde olusturulursa havuzu kontrol eder
        // ve ayni varsa bunlari ozlestirir.
        // Ancak new kullanilir veya bir islem sonucunda String elde edilecek olursa havuza bakmaz
        // once objeyi olusturur sonra atama yapar

            String str1 = "Java";
            String str2 = "Java";

            String str3 = new String("Java");

            String a = "Ja";
            String b = "va";

            String str4 = a+b;
            String str5 = a.concat(b);
            String str6 = str5 + "";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Java")); // true

        // sadece degere bakar equals

        System.out.println("==========");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false
        System.out.println(str1==str5); // false
        System.out.println(str1==str6); // false
        System.out.println(str1=="Java"); // true

        // == hem referansa hem de degere bakar





    }
}
