package java_concept_new;
 
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat
{
	public static void main(String args[])
	{
		Date d=new Date();
		
		System.out.println(d.toString());  //Sun Mar 30 00:45:27 IST 2025
	  
		SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy");
		System.out.println(df.format(d));  // 3/30/2025
		
		SimpleDateFormat df1=new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(df1.format(d));  //3/30/2025 12:55:01
		 
	}

}
