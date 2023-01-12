package Ders12_MethodOlusturmaVeKullanma;

public class C09_Palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in palindrome olup olupmadigini yazdirin
        // duz okunusu ile tersten okunusu ayni olan demektir

        String str = "Aza";

        String tersStr=C08_TerseCevirme.metniTerseCevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Verilen metin palindromedur");
        } else {
            System.out.println("Verilen metin palindrome degildir");
        }
   }
}
