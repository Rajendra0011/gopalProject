package Java_logical_program;

public class ReverseString {

	public static void main(String args[])
	{
		String s="GOpal";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
			
		}
		System.out.print(rev);
	}
}
