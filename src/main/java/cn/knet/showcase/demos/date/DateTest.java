package cn.knet.showcase.demos.date;

import java.text.DateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		String strDate = null;
		
		Date date = new Date();
		System.out.println(date);			// Fri Mar 02 21:43:55 CST 2012
		
		strDate = DateFormat.getDateInstance().format(date);
		System.out.println(strDate);		// Mar 2, 2012

		
		// Date
		strDate = DateFormat.getDateInstance(DateFormat.DEFAULT).format(date);
		System.out.println(strDate);		// Mar 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		System.out.println(strDate);		// 3/2/12
		
		strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		System.out.println(strDate);		// Mar 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.LONG).format(date);
		System.out.println(strDate);		// March 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
		System.out.println(strDate);		// Friday, March 2, 2012
		

		// DateTime
		strDate = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT).format(date);
		System.out.println(strDate);		// Mar 2, 2012 11:06:36 PM

		strDate = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date);
		System.out.println(strDate);		// 3/2/12 11:06 PM
		
		strDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(date);
		System.out.println(strDate);		// Mar 2, 2012 11:06:36 PM

		strDate = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(date);
		System.out.println(strDate);		// March 2, 2012 11:06:36 PM CST

		strDate = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL).format(date);
		System.out.println(strDate);		// Friday, March 2, 2012 11:06:36 PM CST
	}
}