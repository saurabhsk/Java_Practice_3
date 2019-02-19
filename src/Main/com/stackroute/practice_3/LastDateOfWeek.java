package com.stackroute.practice_3;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDateOfWeek {

    String fdate, ldate;
    Calendar c = Calendar.getInstance();
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

    public String firstWeekDay(String str) {

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        fdate = df.format(c.getTime());
        System.out.println(fdate);
        return fdate;
    }

    public String lastWeekDay(String str) {
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        c.add(Calendar.DATE, 6);

        ldate = df.format(c.getTime());
        System.out.println(ldate);
        return ldate;

    }

}
