package day1;

import java.util.HashMap;
import java.util.Map;

public class Number_character_String {

	public static void main(String[] args)
	{
     String s="automoo";
     
     Map<Character,Integer> map=new HashMap();
     
     for(char ch:s.toCharArray())
     {
    	 if(!map.containsKey(ch))
    	 {
    		 map.put(ch, 1);
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
