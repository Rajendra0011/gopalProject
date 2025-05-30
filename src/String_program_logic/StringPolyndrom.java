package String_program_logic;

public class StringPolyndrom {

	public static void main(String[] args) 
	{
     String s="MADAM";
      String rev="";
    		  
     for(int i=s.length()-1;i>=0;i--)
     {
    	 rev=rev+s.charAt(i);
     }
     System.out.println(rev);

     if(s.equals(rev))
     {
    	 System.out.println("this string is poyndrom");
     }
     else
     {
    	 System.out.println("this string is not polyndrom");
     }
	}

}
