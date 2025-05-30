package interview_Questions;

public class Reverse_first_word_String {

	public static void main(String[] args) 
	{
	  String s="Selenium with java";
	  String word[]=s.split(" ",2);
	  
	  String firstReverseword=new StringBuilder(word[0]).reverse().toString();
	  
	  String output=firstReverseword+ " "+word[1];
	  System.out.println(output);
	 	
	}

}
