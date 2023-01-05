package Ders12_MethodOlusturmaVeKullanma;

public class C05_Faktoryel {
    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturun, faktoryel degerini yazdirin

        int input = 23;
        if (input > 0 && input < 15) {
            faktoryelYazdir(input);
        } else {
            System.out.println("Girilen sayi 15'den kucuk tamsayi olmalidir");

        }
    }
        public static void faktoryelYazdir ( int sayi){

            int faktoryelSonucu = 1;

            for (int i = sayi; i >= 1; i--) {
                faktoryelSonucu *= i;  // her loop'da gelen sayiyi onceki deger ile carpalim
            }

            System.out.println("Girilen " + sayi + " icin faktoryel : " + faktoryelSonucu);
        }
    }
