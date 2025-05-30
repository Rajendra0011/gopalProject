package Java_logical_program;

public class FabonaciiSeries2
{
	public static void main(String args[])
	{
		int a=0;
		int b=1;
	    int c;
	    
	    System.out.print(a+","+b);
	    
	    for(int i=1;i<10;i++)
	    {
	    	c=a+b;
	    	
	    	
	    	// swapping value
	    	a=b;
	    	b=c;
	    	System.out.print(","+c);
	    	
	    }
		
	}

}
