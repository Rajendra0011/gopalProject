package logicalPractice;

public class COuntofOddNumber 
{
	public static void main(String args[])
	{
	//	int a[]= {2,43,2,9,8,6,9};
		
		String c="123586";
		
		char[] a = c.toCharArray();
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}	
		}
		System.out.println("even number : "+evencount);
		System.out.println("odd number :"+oddcount);
		
	}
	

}
