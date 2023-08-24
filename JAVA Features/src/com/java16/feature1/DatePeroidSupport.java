package com.java16.feature1;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatePeroidSupport {
	
	//zonedDateTime Date/time that will be written to standard output
	 //and will include hour, day period, and zone details.

	public static void main(String[] args) {
		
		// Note that the �B� is used in the pattern to specify that a day period is to be used.
		// B = short, BBB = full, BBBBB = narrow
		// we will get to know details of peroid
		
		printCurrentDayPeriod();
		
		ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]"); 
		printHourDayPeriodAndZone(zone);
		
	}
	
	public static void printCurrentDayPeriod()
	{
	   final String currentDayPeriodStr
	      = DateTimeFormatter.ofPattern("B").format(LocalTime.now());
	   System.out.println(currentDayPeriodStr);
	   
	   final String currentDayPeriodStr1
	      = DateTimeFormatter.ofPattern("h:m:s BBBB").format(LocalTime.now());
	   System.out.println(currentDayPeriodStr1);
	   
	   final String currentDayPeriodStr2
	      = DateTimeFormatter.ofPattern("ms BBBBB").format(LocalTime.now());
	   System.out.println(currentDayPeriodStr2);
	}
	
	public static void printHourDayPeriodAndZone(final ZonedDateTime zonedDateTime)
	{
	   final String dateTimeStr
	      = DateTimeFormatter.ofPattern("hh B, zzzz").format(zonedDateTime);
	   System.out.println(dateTimeStr);
	}
}
