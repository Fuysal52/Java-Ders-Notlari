package Ders22_ImmutableClasses_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C07_DateTimeFormetter {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-01-30T20:14:53.286726600

        // sadece tarihi 30/01/2023 olarak yazdiralim

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(ldt.format(format1)); // 30/01/2023

        // Sadece tarihi 30.01.2023 MAN seklinde yazdiralim

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2)); // 01.30.23 ma

        // Sadece zamani 20:21 am olarak yazdirin

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(ldt.format(format3)); // 20:24 p.m.


    }
}
