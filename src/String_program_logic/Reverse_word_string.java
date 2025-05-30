package String_program_logic;

public class Reverse_word_string {

	public static void main(String[] args) 
	{
		String str="gopal karhale";
		String revword=" ";
		String outputword=" ";
		
		String words[]=str.split(" ");
		
		for(String word:words)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			outputword=revword+" ";
		}
		 System.out.println("reverse string:"+" "+outputword);

	}

}
