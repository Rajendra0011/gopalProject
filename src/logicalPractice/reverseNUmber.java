package logicalPractice;

public class reverseNUmber 
{
	public static void main(String args[])
	{
		int num=12345;
		int rev=0,remd;
		
		while(num !=0)
		{
			remd=num%10;
			
			rev=rev*10+remd;
			
			num=num/10;
		}
		System.out.print(rev);
		
	}

}
