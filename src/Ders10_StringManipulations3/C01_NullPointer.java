package Ders10_StringManipulations3;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "   ";
        String str3 ;
        String str4 = null;

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 3
        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // System.out.println(str3.length());
        // System.out.println(str3.concat("A"));
        // System.out.println(str3.substring(3,6));

        // Java bir variable'yi olusturup deger atanmamasina izin verir ama kullanamazsiniz

        // System.out.println(str4.length()); // hata vermez ama calismaz

        System.out.println(str4); // null
        System.out.println(str4 + "Ali Can"); // nullAli Can
        // System.out.println(str4.concat("Ali Can")); // bunun sonucuna izin vermez. NullPointerException

    }
}
