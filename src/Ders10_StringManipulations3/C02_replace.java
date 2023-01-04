package Ders10_StringManipulations3;

public class C02_replace {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.replace('J', 'j')); // java ogren, isi kap
        System.out.println(str.replace(" ","")); // // Javaogren,isikap

        String telefon= "555 3451223";
        System.out.println(telefon.replace("555", "532")); // 532 3451223
    }
}
