package String_program_logic;

public class ReverseString_word1 {

	public static void main(String[] args)
	{
		String s="gopal ramdas karhale";
		String rev="";
		String word[]=s.split(" ");
		for(String wd:word)
		{
			for(int i=wd.length()-1;i>=0;i--)
			{
			rev=rev+wd.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
