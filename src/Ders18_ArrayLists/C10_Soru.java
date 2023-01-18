package Ders18_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alin
        // q 'ya bastiginda girdigi isimleri bize liste olarak dondurecek list olusturun

        List<String> isimlerListesi = isimListesiOlustur();
        System.out.println(isimlerListesi);

    }

    public static List<String> isimListesiOlustur (){

        List<String> isimListesi = new ArrayList<>();
        String girilenIsim = "";
        Scanner scan=new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklemek icin bir isim girin\nBitirmek icin q'ya basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimListesi.add(girilenIsim);
            }
        } return isimListesi;
    }
}
