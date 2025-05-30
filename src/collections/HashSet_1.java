package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("Selenium");
		 
		hs.add("java");
		hs.add("java");
        hs.add("automation");
        hs.add("gopal");
        hs.add("karhale");
        hs.add("patil");
		System.out.println(hs);
		
		System.out.println(hs.contains("java"));
        System.out.println(hs.contains("JJava"));	
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove("Selenium"));
        System.out.println(hs.contains("automation"));
        System.out.println(hs.size());
        
        System.out.println("=============this is iterator class=========");
        //iterator
        Iterator<String> i=hs.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
        
        
		
		
		
		
	}

}
