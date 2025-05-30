package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompairArray 
{
	public static void main(String args[])
	{
		int a1[]= {10,20,30};
		int a2[]= {30,40,50};
		int a3[]= {30,40,50};
		
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.equals(a1, a3));
		System.out.println(Arrays.equals(a2,a3));
		
		
		
	}

}
