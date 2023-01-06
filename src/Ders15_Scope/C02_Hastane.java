package Ders15_Scope;

public class C02_Hastane {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya/Ankara";

    String personelIsmi = "Personel" ;
    String personelAdresi = "Adres" ;
    String personelTel = "Telefon" ;

    public static void main(String[] args) {

        C02_Hastane per1= new C02_Hastane();

        C02_Hastane per2= new C02_Hastane();

        per1.personelIsmi="Harun";
        per2.personelAdresi= "Cankaya";
        per1.hastaneIsmi= "Java Hastanesi";

        System.out.println(per1.personelTel); // Telefon
        System.out.println(per1.personelIsmi); // Harun
        System.out.println(per2.personelIsmi); // Personel
        System.out.println(per2.personelAdresi); // Cankaya
        System.out.println(per1.hastaneIsmi); // Java Hastanesi
        System.out.println(per2.hastaneIsmi); // Java Hastanesi
        System.out.println(hastaneIsmi); // Java Hastanesi

        per1.personelIsmi="Ali";
        System.out.println(per1.personelIsmi); // Ali

    }

}
