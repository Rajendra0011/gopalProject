package day1;

public class day2 {
	public static void main(String[] args) {
		
		String s="MADAM";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			if (rev.equals(s))
		{
			System.out.println("Palindrom");
		}
		
		else
		{
			System.out.println("not palindrom");
		}
	 }
 }
