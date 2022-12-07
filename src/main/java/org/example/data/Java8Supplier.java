package org.example.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java8Supplier {
    private static final DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
    Supplier<LocalDateTime>supplier=()->LocalDateTime.now();
    LocalDateTime time  =supplier.get();
        System.out.println(time);
        Supplier <String >supplier1=()->dtf.format(LocalDateTime.now());
        String time2=supplier1.get();
        System.out.println(time2);
    }
}
