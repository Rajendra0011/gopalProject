package logicalPractice;

public class DuplicateString_count
{
	public static void main(String args[])
	{
		String s[]={"gopal","karhale","patil","karhale","patil","auto","auto"};
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			 for(int j=i+1;j<s.length;j++)
			 {
				 if(s[i]==s[j])
				 {
					 count++;
				 }
			 }
		}
		
		System.out.println(count);
	}

}
