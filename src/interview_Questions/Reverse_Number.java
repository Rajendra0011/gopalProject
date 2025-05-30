package interview_Questions;

public class Reverse_Number 
{
	public static void main(String args[])
	{
		String s="123456";
		
		StringBuilder sbuilder=new StringBuilder(String.valueOf(s));
		sbuilder.reverse();
		System.out.println(sbuilder);
		
	}

}
