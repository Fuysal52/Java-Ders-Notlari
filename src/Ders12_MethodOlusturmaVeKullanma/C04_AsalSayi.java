package Ders12_MethodOlusturmaVeKullanma;

public class C04_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini true/ false olarak dondurun
        // bir method olsturun

         // bu methodu calistirdigimizda ya direk yazdirmaliyiz
        System.out.println(asalSayiMi(35)); // false

        // veya method call'un getirecegi sonucu atamak icin bir variable olusturabilirim

        boolean asalMiSonucu59 = asalSayiMi(59); // kaydedildi

    }

    public static boolean asalSayiMi (int input) {
        boolean asalSayiMi= true;

        for (int i = 2; i <input ; i++) {
            System.out.println(input%i==0);
               asalSayiMi=false;
               break;

        }
        return asalSayiMi;

    }
}
