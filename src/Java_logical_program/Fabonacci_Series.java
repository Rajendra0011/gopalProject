package Java_logical_program;

public class Fabonacci_Series
{

	public static void main(String[] args)
	{
         // fabonocia_series : 0,1,1,2,3,5,8,13,21(First +second number addition)
		//The Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
		
		int a=0;
		int b=1;
		 
		int sum=0 ;
		
		
		System.out.println("first number is :"+a+","+"second number is: "+b);
		
		for(int i =2;i<=10;i++)
		{
			 sum=a+b;          // 0+1=1
			 System.out.println(sum); //1,2,3,5,8,13,21,34,55..........
			 a=b;
			 b=sum;
			
		}
	 
			
	}


}


