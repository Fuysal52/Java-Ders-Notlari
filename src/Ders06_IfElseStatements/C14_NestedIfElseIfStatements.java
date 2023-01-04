package Ders06_IfElseStatements;

import java.util.Scanner;

public class C14_NestedIfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve liste fiyatini alin
        // Kullaniciya musteri karti olup olmadigini sorun
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin.
        // Musteri karti yoksa 10 urunden fazla alirsa %15 , yoksa %10 indiirm yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunSayisi=scan.nextInt();

        System.out.println("Lutfen urun liste fiyatini yaziniz");
        double listeFiyati=scan.nextDouble();

        System.out.println("Lutfen musteri kartiniz olup olmadigini giriniz\nEvet: E , Hayir: H");
        char musteriKarti=scan.next().charAt(0);

        if (musteriKarti=='E' || musteriKarti=='e')
        {
            if (urunSayisi>10){
                System.out.println("Kazanilan indirim tutari:"+ (int)(listeFiyati*(0.20)*urunSayisi));
            } else {
                System.out.println("Kazanilan indirim tutari:"+ (int)(listeFiyati*(0.15)*urunSayisi));
            }

        } else if (musteriKarti=='K' || musteriKarti=='k')
        {
            if (urunSayisi>10){
                System.out.println("Kazanilan indirim tutari:"+ (int)(listeFiyati*(0.15)*urunSayisi));
            } else {
                System.out.println("Kazanilan indirim tutari:"+ (int)(listeFiyati*(0.10)*urunSayisi));
            }

        } else {
            System.out.println("Kart bilgisi gecersiz");
        }

    }
}
