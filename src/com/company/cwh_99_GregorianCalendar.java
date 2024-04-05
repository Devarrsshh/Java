package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99_GregorianCalendar {
    public static void main (String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2019));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        System.out.println("Date before rolling " + c.getTime());
        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR,true);
        System.out.println("Date after rolling " + c.getTime());

        System.out.println("Calendar : " + c.getTime());
        System.out.println("The hashcode for this calendar is : " + c.hashCode());
    }
}
