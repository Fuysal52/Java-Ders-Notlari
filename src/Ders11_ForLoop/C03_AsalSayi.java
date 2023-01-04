package Ders11_ForLoop;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //  input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        int input= 21;
        String sonuc = "Sayi asal";

        for (int i = 2; i <input ; i++) {
            if (input%i==0) {
                sonuc= "Sayi asal degildir";
                break;
            }

        }
        System.out.println(sonuc);

    }
}
