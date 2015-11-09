package cn.knet.showcase.demos.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangwenling on 2015/11/3.
 */
public class CalenderTest {
    public static void main(String[] args) throws ParseException {

//        Date date = new Date();

        String dateStr = "2015-11-03 16:10:17";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date format = simpleDateFormat.parse(dateStr);

        System.out.println(format);
    }
}
