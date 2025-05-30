package interview_Questions;

public class unique_character_String 
{
	public static void main(String args[])
	{
		String s="abcedeDgabce";
		
		for(int i=0;i<s.length();i++)
		{
			Boolean unique=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					unique=false;
					
				}
			}
			if(unique)
			{
				System.out.println(s.charAt(i));
				break;
			}
			
		}
		
	}

}
