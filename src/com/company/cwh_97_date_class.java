package com.company;

import java.time.LocalDateTime;
import java.time.*;
import java.util.Date;
import java.time.temporal.*;



public class cwh_97_date_class {
    public static void main (String[] args) {
        LocalDateTime localdatetime = LocalDateTime.of(2020, 5, 13, 6, 30);
        System.out.println("Date time: " + localdatetime);

        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

    }
}
