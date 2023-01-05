package Ders12_MethodOlusturmaVeKullanma;

public class C01_Method {
    public static void main(String[] args) {

        String str= "Java'da yolu yariladik";

        str.isEmpty();
        str.isBlank();
        str.toLowerCase();

        // bu methodlar arka planda calisti fakat bir sonuc gormedik
        // Method'un dondurdugu sonucu kullanmak istersek ya yazdiririz
        // ya da donen sonucu ilerde kullanacaksak atama yapabilirim

        String buyukHarfliHali = str.toUpperCase(); // Atama
        System.out.println(buyukHarfliHali); // yazdirma


    }
}
