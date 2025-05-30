package Java_logical_program;

public class AmstrongNumber1 {

	public static void main(String[] args)
	{
		int number=153;
		int temp=number;
		int remd,sum=0;
		
		while(number!=0)
		{
			remd=number%10;
			sum=sum+remd*remd*remd;
			
			number=number/10;	
		}
		if(temp==sum)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("Not amstrong number");
		}

	}

}
