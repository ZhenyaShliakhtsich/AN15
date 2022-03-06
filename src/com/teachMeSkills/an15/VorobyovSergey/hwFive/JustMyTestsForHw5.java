package com.teachMeSkills.an15.VorobyovSergey.hwFive;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JustMyTestsForHw5 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        System.out.println(calendar.getTime());

        //минус 2 месяца с перелистыванием года
        calendar.add(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());

//Это было хорошо!!!!
        DateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(dateFormat1.format(calendar.getTime()));
        DateFormat dateFormat2 = new SimpleDateFormat("MMM dd yy");
        System.out.println(dateFormat2.format(calendar.getTime()));
    }
}

//Calendar расштряет Date
