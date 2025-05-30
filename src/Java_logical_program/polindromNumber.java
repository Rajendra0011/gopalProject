package Java_logical_program;

public class polindromNumber 
{
	public static void main(String[] args) 
	{
		int num=121;
		int temp=num;
		int remd,sum=0;
				
	while(num !=0)
		{
			remd=num%10;
			
			sum=(sum*10)+remd;
			num=num/10;
		}
		if(temp==sum)
	    {
	    	System.out.println("polyndrom number");
	    }
		else
		{
			System.out.println("not polyndrom number");
		}
	}
    
	
}
