package Java_Concept;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo 
{
	public static void main(String args[])
	{
		 Calendar cal=Calendar.getInstance();
		 
		 SimpleDateFormat sd=new SimpleDateFormat("M/d/YYYY HH:MM:SS");
		 
		 System.out.println(sd.format(cal.getTime()));  //12/8/2024 11:12:553
		 
		 System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //8-month
		 
		 System.out.println(cal.get(Calendar.MINUTE)); // 29 minute
		 System.out.println(cal.get(Calendar.AM_PM));  //0
		 System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //2 week
		 
	}

}
