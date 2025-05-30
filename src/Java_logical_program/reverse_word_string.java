package Java_logical_program;

public class reverse_word_string {

	  public static void main(String[] args)
	    {
	        String s = "my name is gopal";
	        String rev="";
	        String[] words = s.split(" ");
	      //  StringBuilder result = new StringBuilder();

	        for (String word : words) 
	        {
	            for(int i=word.length()-1;i>=0;i--)
	            {
	            	rev=rev+word.charAt(i);
	            }
	            rev=rev+" ";
	        	//result.append(new StringBuilder(word).reverse()).append(" ");
	        
    
	       System.out.println(rev);
	        
	      //2. aproach
	       
	         StringBuilder result = new StringBuilder();

	        for (String word1 : words) 
	        {
	             
	             
	        	 result.append(new StringBuilder(word1).reverse()).append(" ");
	        }
   
	        
	        
	        // Trim the final result to remove the trailing space
	      //  System.out.println(result.toString().trim());
	    
	}
	    }
}
