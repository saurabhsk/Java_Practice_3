// Write a java program to calculate first and last date of a week.
//        Output:
//        First Date of Week: Mon 24/07/2017
//        Last date of the week: Sun 30/07/2017
package com.stackroute.practice_3;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDateOfWeek {


    String fdate, ldate;    //Instance variable.
    Calendar c = Calendar.getInstance(); // get current date and time
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy"); //Using DateFormate class

    // Returns the first day of week(Mon)
    public String firstWeekDay(String str) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        c.setTime(sdf.parse(str));
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.DAY_OF_WEEK,c.getFirstDayOfWeek());
        fdate = df.format(c.getTime());
        System.out.println(fdate);
        return fdate;
    }

    //Returns the last day of the week(Sun)
    public String lastWeekDay(String str) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        c.setTime(sdf.parse(str));
        c.setFirstDayOfWeek(Calendar.MONDAY);


        c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);

        ldate = df.format(c.getTime());
        System.out.println(ldate);
        return ldate;

    }

}
