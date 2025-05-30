package Java_Concept;

public class ConstructorDemo1 
{
	//constructor name is same as class name
	public ConstructorDemo1(  )
	{
		System.out.println("THis is constructor class 1");
		System.out.println("This is a class of constructor");
		
	}
	//Parameterized Constructor
	
	public  ConstructorDemo1(int a,int b)
	{
		System.out.println("This is parameterized Constructer");
		int c=a+b;
		System.out.println(c);
	}
	
	public ConstructorDemo1(String str)
	{
		System.out.println(str);
	}
	 
	
	public static void main(String args[])
	{
		 ConstructorDemo1 c=new ConstructorDemo1();
		
		ConstructorDemo1 cc=new ConstructorDemo1(4,5);

		ConstructorDemo1 ccc=new ConstructorDemo1("Hello");
				
	}
	 
}	
