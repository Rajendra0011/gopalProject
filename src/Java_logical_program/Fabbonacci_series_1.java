package Java_logical_program;

public class Fabbonacci_series_1 

{
	public static void main(String args [])
	{
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+","+b);
		
		for(int i=2;i<=10;i++)
		{
			c=a+b;
			System.out.print(","+c);
			
			a=b;
			b=c;
			
		}
		
		
	}

}
