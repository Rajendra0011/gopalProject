package Java_Concept;

public class tryCatchException 

{
	public static void main(String args[])
	{
		 int a[]= {2,5,6};
		 
		 try
		 {
			 System.out.println(a[3]);
		 }
		 catch(IndexOutOfBoundsException e)
		 {
			 System.out.println("This is IndexOutOfBond Exceptions");
		 }
		finally
		{
			System.out.println("delete cokies");
		}
		
	}

}
