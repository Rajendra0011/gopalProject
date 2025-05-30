package day1;

public class Duplicate_char_String1 
{
	public static void main(String args[])
	{
		String a="automation";
		int count=0;
		
		char ch[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length()-1;j++)
			{ 
				if(ch[i]==ch[j])
				{
					count++;
					System.out.println("duplicate character is : "+ch[i]);

				}			
			}
 
		}
		System.out.println(" ");
  System.out.println("count if duplicate character : "+count)	;	
		
	}

	 

}
