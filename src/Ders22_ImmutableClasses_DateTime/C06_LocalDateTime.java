package Ders22_ImmutableClasses_DateTime;

import java.io.FilterOutputStream;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //  2023-01-30T20:06:10.469611500

        System.out.println(ldt.getDayOfWeek()); // MONDAY
        System.out.println(ldt.withYear(2030)); // 2030-01-30T20:09:24.675523800
    }
}
