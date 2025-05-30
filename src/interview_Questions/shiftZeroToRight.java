package interview_Questions;

import java.util.Arrays;

public class shiftZeroToRight 
{
	public static int[] shiftZeroToRight(int [] a)
	{	
	  if(a.length==1)
	  {
		   return a;
	  }
	  int newArray []=new int[a.length];
	  int count=0;
	  for(int number:a)
	  {
		  if(number !=0)
		  {
			  newArray[count]=number;
			  count++;
		  }
	  }
		return newArray;		
	}
	public static void main(String[] args) {
		 
		int []i=new int[] {1,2,3,0,0,0,0};
	
	System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1, 2, 3, 0, 0, 0, 0]
	
	Arrays.sort(i);
	System.out.println(Arrays.toString(i)); //[0, 0, 0, 0, 1, 2, 3]
	
	}

}
