package cn.knet.showcase.demos.date;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);

        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(Calendar.MONTH, 3);


        Date time = instance.getTime();
        System.out.println(time);


    }
}