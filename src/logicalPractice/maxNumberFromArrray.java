package logicalPractice;

public class maxNumberFromArrray 
{
	public static void main(String args[])
	{
		
		int a[]= {1,2,5,8,7,8,5,55,51,68,45};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
	}

}
