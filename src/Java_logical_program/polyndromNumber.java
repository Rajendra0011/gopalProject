package Java_logical_program;

public class polyndromNumber {

	public static void main(String[] args)
	{
		int number=121;
		int remd,sum=0;
		int temp=number;
		
		while(number!=0)
		{
			remd=number%10;
			sum=(sum*10)+remd;
			number=number/10;			
		}
		if(temp==sum)
		{
			System.out.println("polyndrom");
		}
		else
		{
			System.out.println("not polyndrom");
		}
	}

}
