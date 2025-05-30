package logicalPractice;

public class amstrongNUmber 
{
	public static void main(String args[])
	{
		int num=153;
		
		int sum=0,remd;
		int temp=num;
		
		for(int i=0;i<=5;i++)
		{
			remd=num%10;
			sum=sum+remd*remd*remd;
			num=num/10;		
		}
		if(temp==sum)
		{
			System.out.println("this is amstrong number");
		}
		else
		{
			System.out.println("this is not amstrong number");
		}
		
	}

}
