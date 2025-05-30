package interview_Questions;

public class reverse_Word {

	public static void main(String[] args)
	{
      String s="gopal karhale patil";
      
      String words[]=s.split(" ");
      
      StringBuffer sbuffer=new StringBuffer();
      
     for(String word:words)
     {
    	 StringBuffer ssbuffer=new StringBuffer(word);
    	 sbuffer.append(ssbuffer.reverse().append(" "));
    	 
     }
     System.out.println(sbuffer);
      
		
		
	}

}
