package logicalPractice;

public class minnumberfromArray 
{
	public static void main(String args[])
	{
		
		int a[]= {3,4,2,24,2,43,23,234,15,44,34};
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
