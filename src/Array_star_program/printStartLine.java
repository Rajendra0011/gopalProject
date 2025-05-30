package Array_star_program;

public class printStartLine 
{
	public static void main(String args[])
	{
		//int line=4;
		for(int b=1;b<=4;b++)
		{
			for(int a=3;a>=b;a--)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}

}
