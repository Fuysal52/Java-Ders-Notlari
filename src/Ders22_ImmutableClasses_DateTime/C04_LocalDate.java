package Ders22_ImmutableClasses_DateTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-01-27

        System.out.println(tarih.getDayOfWeek()); // FRIDAY
        System.out.println(tarih.getMonthValue()); // 1
        System.out.println(tarih.getMonth()); // JANUARY
        System.out.println(tarih.getDayOfYear()); // 27
        System.out.println(tarih.getDayOfMonth()); // 27

        System.out.println(tarih.withYear(2015)); // 2015-01-27
        System.out.println(tarih.withDayOfMonth(15)); // 2023-01-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015)); // 2015-01-15

        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih.minusWeeks(5)); // 2022-12-23
        System.out.println(tarih.minusYears(3).minusMonths(3).minusDays(3));//

        System.out.println(tarih.plusWeeks(19)); // 2023-06-09
        System.out.println(tarih.plusYears(12)); // 2035-01-27


        LocalDate tarih1 = LocalDate.of(1975,10,13);
        LocalDate tarih2 = LocalDate.of(1975, 10, 20);

        System.out.println(tarih1.isBefore(tarih2) ? "Tarih1 daha eski" : "Tarih2 daha eski"); // Tarih1 daha eski

        System.out.println(tarih1.isLeapYear()); // false

        System.out.println(tarih.hashCode()); // 4143195
        System.out.println(tarih1.hashCode()); // 4045453
        System.out.println(tarih2.minusDays(7).hashCode()); // 4045453

    }
}
