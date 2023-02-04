package Ders25_Inheritance;

public class ECorolla extends DToyota{

    ECorolla (){
        System.out.println("Parametresiz Coroola contructr'i calisti");
    }
    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli constroctor calisti");
    }

    String model = "Corolla";
    String uretimYeri = "Turkiye";

    public static void main(String[] args) {

        ECorolla cor1 = new ECorolla("Mavi");

    }
    /*
    Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin constructir calismalidir
    INHERINTANCE DE BILIYRZ KI CHILD CLASS TAN OLUSTURLAN HER OBJE parent class'daki her ozellige sahip olur

    parent class daki ozelliklere sahip olabilmesi icin parent class daki constructr larda calismalidir

    Bu calismayi java super() sayesinde yapar
    javada nher olusturlan class'da gorunmesede de default constructor oldugu gibi extent keyword kullanilan her
    class'da olusturulan her constructor'in ilk satirinda gorunmesede super () constructor call vardir
     */
}
