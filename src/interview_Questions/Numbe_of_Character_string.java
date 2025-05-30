package interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class Numbe_of_Character_string {

	public static void main(String[] args)
	{
		String s="karhaleee";
		
		Map<Character,Integer>map=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		 System.out.println(map);  //{a=2, r=1, e=3, h=1, k=1, l=1}
	}

}
