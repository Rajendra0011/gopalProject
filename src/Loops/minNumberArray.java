package Loops;

public class minNumberArray
{
	public static void main(String args[])
	{
		int a[]= {2,5,8,1,3};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				 min=a[i];
			}
		}
		System.out.println(min);   //1
	}
}

