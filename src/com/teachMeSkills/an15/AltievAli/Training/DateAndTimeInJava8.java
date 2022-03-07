package com.teachMeSkills.an15.AltievAli.Training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTimeInJava8 {

    public static void main(String[] args) {

        LocalDateTime ltd = java.time.LocalDateTime.of(2020, 6, 17, 18, 0);
        ltd = ltd.plusDays(10);
        ltd = ltd.plusMinutes(9);
        ltd = ltd.plusHours(2);
        System.out.println(ltd);


        LocalDate ld = LocalDate.of(2000, Month.APRIL, 10);
        ld = ld.plusDays(6);
        ld = ld.plusYears(22);
        System.out.println(ld);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getEra());
        System.out.println(ld.getChronology());



        LocalDate ld1 = LocalDate.of(1999, Month.JULY, 23);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        System.out.println(dateTimeFormatter.format(ld1));

        LocalDate ld2 = LocalDate.of( 2000,4,10);
        LocalDate ld3 = LocalDate.of( 1999,4,10);

        int result = ld3.compareTo(ld1);
        System.out.println(result);
        System.out.println(ld3.isAfter(ld1));
        System.out.println(ld2.isBefore(ld1));

        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow.isBefore(ld1) && localDateNow.isAfter(ld1));
        System.out.println(localDateNow.isBefore(ld1) || localDateNow.isAfter(ld1));


//


        LocalDate CykarylanGuni = LocalDate.of(2000, 4, 10);
        LocalDate SugunkiGun = LocalDate.now();
       // DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Period period = Period.between(CykarylanGuni, SugunkiGun);
        String.format("%d years, %d months, %d days" ,period.getYears(),period.getMonths(),period.getDays());
        System.out.println(String.format("%d years, %d months, %d days" ,period.getYears(),period.getMonths()
                ,period.getDays()));
//        System.out.println(dateTimeFormatter.format(Period)

//        Выдержка вина под названием "+name+" составляет "+days+" дней


    }

}
