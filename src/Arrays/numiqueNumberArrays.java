package Arrays;

import java.util.ArrayList;

public class numiqueNumberArrays {

	public static void main(String[] args)
	{
      int a[]= {12,15,12,15,10};
      
      ArrayList<Integer> ar=new ArrayList<Integer>();
      for(int i=0;i<a.length;i++)
      {
    	  if(!ar.contains(a[i]))
    	  {
    		  int k=0;
    		  ar.add(a[i]);
    		  k++;
    		  
    		  for(int j=i+1;j<a.length;j++)
    		  {
    			  if(a[i]==a[j])
    			  {
    				  k++;
    			  }
    		  }
    		  if(k==1)
    			  System.out.println(a[i]+" : Unique number");
    	  }
      }
      
      

	}

}
