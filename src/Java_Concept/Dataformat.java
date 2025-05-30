package Java_Concept;

import java.text.SimpleDateFormat;
import java.util.Date; 

public class Dataformat 
{
	public static void main(String args[])
	{
		//currenrt date/time/year
		
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdt=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdt.format(d));
		
		

		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy HH:MM:SS");
		System.out.println(sd.format(d));
		
		
	}

}
