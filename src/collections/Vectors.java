package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectors
{  

	public static void main(String args[])
	{
		
		Vector v=new Vector();
		v.add("Gopal");
		v.add("Karhale");
		v.add('G');
		v.add(10);
		v.add(12.25f);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		
		// is empty vector
		System.out.println(v.isEmpty()); //false
		
		//Get second index value
		System.out.println("second index value is :"+v.get(2)); //G
		
		//size of vector
		System.out.println("Size of Vector : "+v.size());
		System.out.println("capacity :"+v.capacity());
		
		//verify character is available in vector class
		System.out.println(v.contains('G')); //True
		System.out.println(v.contains('a')); // false
		
		
		//add info in vactor class
		v.add(1,12.56f);
		System.out.println(v);  //[Gopal, 12.56, Karhale, G, 10, 12.25, null, null]
		
		//remove info from vector class
		v.remove(1);
		System.out.println(v); //[Gopal, Karhale, G, 10, 12.25, null, null]
		
		//update /modify info from vector : karhale >> patil
		v.set(1, "patil");
		System.out.println(v); // [Gopal, patil, G, 10, 12.25, null, null]
		
		System.out.println("--Print vector info using iteratot--");
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--print vector info using List iterator--");
		
		ListIterator Litr=v.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println("------Print vector info using for loop------");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("----print vector info using for each loop--------");
				
				
				for(Object v1:v)
				{
					System.out.println(v1);
				}
				
				System.out.println("-----print vector info using  enumerator------");
				 Enumeration emu = v.elements();	
				 while(emu.hasMoreElements())
				 {
					 System.out.println(emu.nextElement());
				 }
		
		
		
		
		
		
	}

}
