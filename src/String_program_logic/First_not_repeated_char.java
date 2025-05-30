package String_program_logic;

import java.util.HashMap;
import java.util.Map;

public class First_not_repeated_char {

	public static void main(String[] args) 
	{
		String str="AAbbBCD";
		
		
		//1.approch 1
		for(int i=0;i<str.length();i++)
		{
			Boolean unique=true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unique=false;
				}
			}
			if(unique)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	
		
//2.approach 2
		String s="karhale";
		Map<Character,Integer> map=new HashMap();
		
		for(int j=0;j<s.length();j++)
		{
		   char ch=s.charAt(j);
		   if(map.containsKey(ch))
		   {
			   map.put(ch,map.get(ch)+1);
		   }
		   else
		   {
			   map.put(ch,1);
		   }	
		}
		 System.out.println(map);
	}
}
