package Ders16_Arrays;

public class C07_Soru {
    public static void main(String[] args) {

        // bir marketin fiyatlarin fiyatlarini tutan bir array var
        // bu marketteki en dusuk ve en yuksek fiyatlari yazdiran method olusturun

        double[] fiyatlar= {23, 34.5, 42.1, 5.7, 3.4, 23.5};
        enDusukEnYuksekFiyatlar(fiyatlar);

    }

    public static void enDusukEnYuksekFiyatlar (double[] fiyatlar){ // burdaki fiyatlar yukardaki fiyatlar ile aynida olabilir farklida

        double enDusukFiyat = fiyatlar[0];
        double enYuksekFiyat = fiyatlar[0];

        for (int i = 0; i <fiyatlar.length ; i++) {
            if (enDusukFiyat>fiyatlar[i]){
                enDusukFiyat=fiyatlar[i];
            }
            if (enYuksekFiyat<fiyatlar[i]){
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("Listedeki en dusuk fiyat:" + enDusukFiyat );
        System.out.println("Listedeki en yuksek fiyat:" + enYuksekFiyat);
    }
}
