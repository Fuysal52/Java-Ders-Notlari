package Ders03_DataCasting_WrapperClasses;

public class C08_WrapperClases {
    public static void main(String[] args) {

        String str="Java";

        System.out.println(str.toUpperCase()); // harfleri buyutme ozelligi

        String str2= "1234";
        String str3= "1000";

        System.out.println(str2+str3); // 12341000 ... String bir metinsel ifade oldugu icin bunlari yanyana getiri
        // Bu durumda hazir methotlardan yardim aliriz

        System.out.println(Integer.valueOf(str2)+ Integer.valueOf(str3)); // 2234

        int str2Int= Integer.parseInt(str2);
        int str3Int= Integer.parseInt(str3);
        System.out.println(str2Int+str3Int); // 2234

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        char karekP= 'á';
        System.out.println(Character.isDigit(karekP));  // false
        System.out.println(Character.isLowerCase(karekP)); // True
        System.out.println(Character.isAlphabetic(karekP)); // true


        // Wrapper class'larda casting (donusturme) olmaz

        Short sayi6=45;
        // Integer sayi7= (Integer) sayi6;  Bunu kabul etmez
    }
}
