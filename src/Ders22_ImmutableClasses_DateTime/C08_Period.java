package Ders22_ImmutableClasses_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1986,12,15);
        LocalDate bugun = LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P36Y1M16D
        System.out.println(yas.getYears()); // 36

        LocalDate baslangic = LocalDate.of(2010,8,5);
        LocalDate bitis = LocalDate.of(2015,4,9);

        Period sure = Period.between(baslangic,bitis);
        System.out.println(sure); // P4Y8M4D
    }
}
