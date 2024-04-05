package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class cwh_100_JavaTime {
    public static void main (String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
    }
}
