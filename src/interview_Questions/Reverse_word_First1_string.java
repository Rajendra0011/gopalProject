package interview_Questions;

public class Reverse_word_First1_string 
{
	public static void main(String args[])
	{
		String s="selenium with java";
		
		String words[]=s.split(" ");
		
		StringBuffer reverse=new StringBuffer();
		
		for(String word:words)
		{
			StringBuffer sbuffer=new StringBuffer(word);
			reverse.append(sbuffer.reverse()).append(" ");
		}
		System.out.println(reverse);  //muineles htiw avaj 
	}

}
