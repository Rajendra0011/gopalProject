package Arrays;

public class LargesNumberArray 
{
	public static void main(String args[])
	{
		int ab[]= {12,13,15,18,99};
		int max=ab[0];
		 
		
		for(int i=0;i<ab.length;i++)
		{
		 
				if(ab[i]>max )
				{
				max=ab[i];
							 
			}
		}
		System.out.println(max);
	 
	}
	
}
