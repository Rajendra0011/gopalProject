package interview_Questions;

public class Reverse_String
{
	public static void main(String args[])
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("polyndrom number");
		}
		
		else
		{
			System.out.println("not polyndrom");
		}
	}

}
