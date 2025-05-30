package String_program_logic;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_chat 
{
	public static void main(String args[])
	{
	String str="programing";
	
	//1.approach 1
	StringBuilder sb1=new StringBuilder();
	
	str.chars().distinct().forEach(c-> sb1.append((char)c));
	System.out.println("print sb1:"+sb1);
	
	
	//2. approach 2
	StringBuilder sb2=new StringBuilder();
	Set<Character> set=new LinkedHashSet();
	for(int i=0;i<str.length();i++)
	{
		set.add(str.charAt(i));
	}
	
	for(Character c:set)
	{
		sb2.append(c);
	}
	System.out.println("print sb2:"+sb2);
	
	}
}
