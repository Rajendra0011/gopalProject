package String_program_logic;

public class Reverse_word_string1 {

	public static void main(String[] args) 
	{
		String str="gopal karhale patil";
		
		String word[]=str.split(" ");
	 
		for(int i=word.length-1;i>=0;i--)
		{
		 
			 System.out.print(word[i]+" ");
		}
	 
		 
    }
}