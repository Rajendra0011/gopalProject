package Java_Concept;

public class try_catchblock
{
	public static void main(String args[])
	{
		
		int a=5;
		int b=0;
		
		try
		{
			int k=a/b;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("I catched the Arithmatec exception");
		}
		 
		
	}

}
