package java_concept_new;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender_demo {

	public static void main(String[] args)
	{
		Calendar cal=Calendar.getInstance();
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));  //3/30/2025 01:04:50
		
		System.out.println(cal.get(Calendar.AM_PM));// 0 am ,1 pm
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));  //30 date
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));  //
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	 

	}

}
