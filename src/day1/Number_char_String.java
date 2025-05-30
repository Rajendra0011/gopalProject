package day1;

public class Number_char_String {

	public static void main(String[] args)
	{
       String s="Automations";
       char ch='o';
       int count=0;
       
       for(int i=0;i<s.length()-1;i++)
       {
    	   if(s.charAt(i)==ch)
    	   {
    		   count++;
    	   }
         }
	System.out.println("Name of character is: "+ch);	
	System.out.println("count of 'o' character is: "+count);

	}

}
