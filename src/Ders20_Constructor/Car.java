package Ders20_Constructor;

public class Car {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil=1900;
    int km;
    String renk= "Renk secilmemis";

    public Car(String marka, String model, int yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;

    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    public static void hareket(){
        System.out.println("Tum arabalar hareket eder");
    }
    public Car(){

    }
    public Car  (String mrk, String mdl, int yl, int kmetre, String rnk){

        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }


}
