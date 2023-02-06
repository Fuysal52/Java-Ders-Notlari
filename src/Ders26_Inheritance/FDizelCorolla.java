package Ders26_Inheritance;

import Ders20_Constructor.Toyota;

public class FDizelCorolla extends ECorolla{

    String motor = "1.6 dizel motor";
    String yakit = "Dizel";
    String guvenlik = "Abs";
    String renk = "Renk belirtilmedi";

    public static void main(String[] args) {

        // Bazen child claas dan obje olusturmakla beraber bu child classs'in parent class'daki hangi
        // ozellikleri aldigini bilmek isteriz.
        // Bu durumda data turunu constructor'i kullanilan class'in
        // parent class'larindan secebiliriz

        DToyota c3 = new FDizelCorolla();

        System.out.println(c3.motor); // Toyota Class == Motor belirtilmedi
        System.out.println(c3.yakit); // Toyota Class == Yakit belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk); // // CTE

        System.out.println(c3.model); // Toyota Class == Model belirtilmedi
        // System.out.println(c3.uretimYeri); // CTE
        // System.out.println(c3.teker); // CTE
        // System.out.println(c3.vites); // CTE

        System.out.println(c3.marka); // Toyota Class == Toyota


        ECorolla c2 = new FDizelCorolla();

        System.out.println(c2.motor); // Toyota Class == Motor belirtilmedi
        System.out.println(c2.yakit); // Toyota Class == Yakit belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk); // // CTE

        System.out.println(c2.model); // Corolla Class == Corolla
        System.out.println(c2.uretimYeri); // Corolla Class == Turkiye
        System.out.println(c2.teker); // Corolla Class == 200.55 teker
        System.out.println(c2.vites); // Corolla Class ==  Vites belirtilmedi

        System.out.println(c2.marka); // Toyota Class == Toyota

        FDizelCorolla c1 = new FDizelCorolla();

        System.out.println(c1.motor); // Dizel Class == 1.6 dizel motor
        System.out.println(c1.yakit); // Dizel Class == Dizel
        System.out.println(c1.guvenlik); // Dizel Class == Abs
        System.out.println(c1.renk); // // Dizel Class == Renk belirtilmedi

        System.out.println(c1.model); // Corolla Class == Corolla
        System.out.println(c1.uretimYeri); // Corolla Class == Turkiye
        System.out.println(c1.teker); // Corolla Class == 200.55 teker
        System.out.println(c1.vites); // Corolla Class == Vites belirtilmedi

        System.out.println(c1.marka); // Toyota Class == Toyota



    }

}
