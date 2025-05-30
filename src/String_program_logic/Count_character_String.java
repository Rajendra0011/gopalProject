package String_program_logic;

import java.util.HashMap;
import java.util.Map;

public class Count_character_String {

	public static void main(String[] args)
	{
	 String str="gopall";
	 
	 Map<Character,Integer> map=new HashMap();
	 
	  char [] chars=str.toCharArray();
	  for(char ch:chars)
	  {
		  if(!map.containsKey(ch))
		  {
			  map.put(ch,1);
		  }
		  else
		  {
			  int cnt=map.get(ch);
			  map.put(ch,cnt+1);
		  }
	  }
	 System.out.println(map);
	}

}
