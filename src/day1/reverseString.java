package day1;

public class reverseString 
{
	public static void main(String args[])
	{
		String s="automs";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
