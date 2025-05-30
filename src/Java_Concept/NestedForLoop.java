package Java_Concept;

public class NestedForLoop 
{
	public static void main(String args[])
	{
		for(int i=0;i<=2;i++)
		{
			System.out.println("outer loop started");
			for(int j=0;j<=2;j++)
			{
				System.out.println("Inner Loop");
			}
			
			System.out.println("Outer loop finished");
		}
		
		
	}

}
