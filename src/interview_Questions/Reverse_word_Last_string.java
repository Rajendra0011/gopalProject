package interview_Questions;

public class Reverse_word_Last_string {

	public static void main(String[] args)
	{
      String s="selenium with java";   
      String words[]=s.split(" ");
      StringBuilder sbuilder=new StringBuilder();
       for(int i=words.length-1;i>=0;i--)
      {
       sbuilder.append(words[i]).append(" "); 
      }
      System.out.println(sbuilder);
      }

}

//output : java with selenium