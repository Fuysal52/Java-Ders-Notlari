package Ders20_Constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        Car car1 = new Car("BMV", "5.20", 2020,15000,"Beyaz");
        System.out.println(car1); // Car{marka='BMV', model='5.20', yil=2020, km=15000, renk='Beyaz'}

        Car car2= new Car("Tofas", "Sahin", 2010);
        System.out.println(car2); // Car{marka='Tofas', model='Sahin', yil=2010, km=0, renk='Renk secilmemis'}

        Car car3 = new Car("Toyota","Corolla", 2016, "Gri");
        System.out.println(car3); // Car{marka='Toyota', model='Corolla', yil=2016, km=0, renk='Gri'}
    }
}
