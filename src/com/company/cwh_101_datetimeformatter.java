package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main (String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

       // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        DateTimeFormatter fd = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fd2 = DateTimeFormatter.ISO_LOCAL_TIME;
        //System.out.println(fd);

        String myDate = dt.format(fd2);
        System.out.println(myDate);


        LocalDateTime dt2 = LocalDateTime.now();
        System.out.println(dt2);

        DateTimeFormatter xd = DateTimeFormatter.ofPattern("dd-MM-YYYY -- y-D");
        DateTimeFormatter xdd = DateTimeFormatter.ISO_DATE;

        String dvrsh = dt.format(xd);
        System.out.println(dvrsh);
    }
}
