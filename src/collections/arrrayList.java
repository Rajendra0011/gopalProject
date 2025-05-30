package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrrayList
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		
		//add string in array
		a.add("Selenium");
		a.add("python");
		a.add("python");
		a.add("testNG");
		a.add(10.5f);
		a.add(121.12f);
		a.add(null);
		
		
		
		a.add(1, "automation");
		System.out.println(a);
		
		System.out.println(a.indexOf("automation"));
		System.out.println(a.indexOf("python"));
		System.out.println(a.indexOf("Selenium"));
		
		// string contains available or not
		System.out.println(a.contains("automation")); //true
		
		System.out.println(a.size()); //4
		System.out.println(a.isEmpty());
		System.out.println(a.iterator());
		System.out.println(a.containsAll(a));
		
		System.out.println(a);          //[Selenium, automation, python, python]
		System.out.println(a.remove(0)); //automation
		System.out.println(a);      //[Selenium, python, python]
		System.out.println(a.size()); //7
		
		//get data from array
		System.out.println(a.get(3)); //TestNG
		System.out.println(a);       //[automation, python, python, testNG, 10.5, 121.12, null]
		//view available containts in array
		 System.out.println(a.contains('A')); //true
		
		//Add data in between array
		 a.add(1,'A');
		 System.out.println(a);      // [automation, A, python, python, testNG, 10.5, 121.12, null]
		  
		 //remove/ modify info in arrayList
		  a.remove(2);
		  System.out.println(a);    //  [automation, A, python, testNG, 10.5, 121.12, null]
		  
		  //Update / modify info in arrayList
		  a.set(1, "patil");
		  System.out.println(a); //[automation, patil, python, testNG, 10.5, 121.12, null]
		  
		  System.out.println("---Print arrayList info using iterator");
		  
		  Iterator itr=a.iterator();
		  
		  while(itr.hasNext())
		  {
			 System.out.println( itr.next());   //automation patil python testNG 10.5 121.12 null
		  }
		                
		  System.out.println("============");
		  System.out.println("==Print arrayList info using for loop===");
		  
		  for(int i=0;i<=a.size()-1;i++)
		  {
			  System.out.println(a.get(i));  //automation patil python testNG 10.5 121.12 null
			  
		  }
		  
		  
		  System.out.println("==============Print arrayList info using for each loop========");
				  
		  for(Object s1:a)
		  {
			  System.out.println(s1);  //automation patil python testNG 10.5 121.12 null
			  
		  }
		  
				  
		 
		 
		
		
		 
		
		
		
		
		
	}

}
