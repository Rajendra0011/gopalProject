package Java_logical_program;

public class Amstrong_Number 
{
	public static void main(String args [])
	{
		int number=153;
		int temp=number;
		int remd;
		int sum=0;
		
	 while(number !=0)
	 {
		 remd=number%10;
		 
		 sum=sum+remd*remd*remd;
		 number=number/10;
	 }
		
		if(temp==sum)
		{
			System.out.println("Number is amstrong");
		}
		else
		{
			System.out.println("Number is not amstrong");
		}
	}

	 

}
