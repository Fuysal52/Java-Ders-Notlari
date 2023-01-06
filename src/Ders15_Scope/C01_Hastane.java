package Ders15_Scope;

public class C01_Hastane {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya/Ankara";

    String personelIsmi ;
    String personelAdresi ;
    String personelTel ;
    public static void main(String[] args) {


        C01_Hastane per1= new C01_Hastane();

        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelTel); // null

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Ankara";
        per1.personelTel="123456789";

        C01_Hastane per2= new C01_Hastane();

        System.out.println(per2.personelIsmi); // isim atamadan once String oldugu icin default degerlerden null atar

        per2.personelIsmi="Ayse";
        System.out.println(per2.personelIsmi); // Ayse

        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi

        per2.hastaneIsmi = "Java Hastanesi";

        System.out.println(hastaneIsmi); // Java Hastanesi
        System.out.println(per1.hastaneIsmi); //  Java Hastanesi


    }

    public static void method1 (){
        System.out.println(hastaneIsmi);
    }

    public void method2 (){
        System.out.println(hastaneIsmi);
    }
}

