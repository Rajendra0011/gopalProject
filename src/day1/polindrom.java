package day1;

public class polindrom 
{
	public static void main(String args[])
	{
		int num=1213;
		int sum=0,remd;
		int temp=num;
	while(num>0)
	{
		remd=num%10;
		sum=sum*10+remd;
		num=num/10;
			
	}
 	
	if (temp==sum)
		System.out.println("Palindrom");
	else
	{
		System.out.println("not palindrom");
	}

	}}
