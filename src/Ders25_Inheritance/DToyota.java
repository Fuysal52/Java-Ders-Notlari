package Ders25_Inheritance;

public class DToyota extends CCar{

    DToyota(){
        System.out.println("Parametresiz Toyota constructr'i calisti");
    }
    DToyota(String param1){
        System.out.println("String parametreli Toyota constructor'i calisti");
    }

    String marka= "Totoya";
    String uretimYeri = "Toyota farkli ulkelerde uretilir";
}
