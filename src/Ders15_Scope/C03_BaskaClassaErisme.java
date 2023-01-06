package Ders15_Scope;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {

        System.out.println(C01_Hastane.hastaneAdresi); //Cankaya/Ankara
        C01_Hastane.method1(); // Yildiz Hastanesi

        C01_Hastane per1 = new C01_Hastane(); // java C01 e gider ve oradaki static leri alir

        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi

        per1.personelIsmi= "Ahmet";
        per1.personelAdresi= "Ordu";
        per1.hastaneIsmi="Uskudar";

        System.out.println(per1.personelIsmi); // Ahmet
        System.out.println(per1.personelAdresi); // Ordu
        System.out.println(per1.hastaneIsmi); // Uskudar


    }
}
