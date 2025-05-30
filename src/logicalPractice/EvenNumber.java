package logicalPractice;

public class EvenNumber 
{
	public static void main(String args[])
	{
		int a[]= {45,1,5,54,5,8,5,8};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("This is a even Number : "+a[i]);
			}
			else
			{
				System.out.println("This is odd number: "+a[i]);
			}
			
			
		}
		
		
	}

}
