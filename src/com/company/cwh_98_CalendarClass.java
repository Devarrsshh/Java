package com.company;

import java.util.Calendar;

public class cwh_98_CalendarClass {
    public static void main (String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        c.add(Calendar.YEAR, 5);
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(c);

    }
}
