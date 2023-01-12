package Ders08_StringManipulations;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir";
        System.out.println(str.charAt(12)); // r
        System.out.println(str.charAt(3)); // a

        // charAt() method'u bize char dondurdugu icin toUpperCase() calismaz
        // String method'lari charAt() ile kullanmak isterseniz
        // charAt() 'den once kullanmalisiniz

        System.out.println(str.toUpperCase().charAt(13-4)); // L
        System.out.println(str.charAt(str.length()-1)); // son karakteri bulma yolu

    }
}
