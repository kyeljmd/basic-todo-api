package com.kyeljmd.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by kyel on 2/5/2017.
 */
public class Util {

    public static final   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String toReadableDateTime(LocalDateTime time) {
        return formatter.format(time);
    }
}
