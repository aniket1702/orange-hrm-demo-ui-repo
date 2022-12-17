package org.orangehrm.ui.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private String timeInMillis;
    private Long x;
    private String newDateTimeFormat;

    /* returns current Date and Time */
    public String getCurrentDateTime()
    {
        timeInMillis= String.valueOf(System.currentTimeMillis());
        x=Long.parseLong(timeInMillis);

        Date date=new Date(x);
        DateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_aa");
        newDateTimeFormat=formatter.format(date);

        return newDateTimeFormat;

    }
}
