package Ders12_MethodOlusturmaVeKullanma;

public class C08_TerseCevirme {
    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // o halini bize donduren bir methot olusturun

        System.out.println(metniTerseCevir("Java"));

    }

    public static String metniTerseCevir(String str) {

        String tersStr="";

        for (int i =str.length()-1 ; i >=0 ; i--) {

            tersStr+=str.charAt(i);

        }
        return tersStr;
    }
}
