package logicalPractice;

public class DuplicateNumber 
{
	public static void main(String args[])
	{
		int a[]= {3,4,2,2,4,2,12,23};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					int count=0;
					count ++;
					System.out.println(a[i]);
				}
			}
			
		}
		
	}

}
