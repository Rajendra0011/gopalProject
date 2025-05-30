package day1;

public class reverseString_madam 
{
	public static void main(String args[])
	{
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(rev))
		{
			System.out.println("This is polyndrom");
		}
		else
		{
			System.out.println("This is not polyndrom");
		}
		
	}

}
