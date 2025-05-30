package Arrays;

public class minNumberfromArray 
{
	public static void main(String args[])
	{
		
		int a[]= {12,56,25,4,5,6,3};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		 System.out.println(min);
	}
	
}
