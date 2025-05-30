package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 
{
	public static void main(String args[])
	{
	 HashMap<Integer,String> hm=new HashMap<Integer,String>();
	 hm.put(0, "Gopal");
	 hm.put(1,"karhale");
	 hm.put(2,"patil");
	 System.out.println(hm);
	 System.out.println(hm.get(2));
	 
	 Set sn=hm.entrySet();
	 Iterator it=sn.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		 
				 
		 
		 
	 }
	 
	 
		
		
		
		
	}

}
