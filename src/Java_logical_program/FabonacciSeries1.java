package Java_logical_program;

public class FabonacciSeries1 
{
	public static void main(String args[])
	{
		// 0,1,1,2,3,5,8,13....>> addition of current & previous number
		
		int a=0;
		int b=1;
		int c ;
	 
		System.out.print(a+" ," +b);
		
		for(int i=1;i<10;i++)
		{
		   c=a+b;
		   System.out.print("," +c);
		   a=b;
		   b=c;
		  
			
		}
			
	}

}
