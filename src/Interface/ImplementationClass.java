package Interface;

public class ImplementationClass implements Interface1,Inteface2
{
	public static void main(String args[])
	{
		ImplementationClass p=new ImplementationClass();
		p.product1();
		p.product2();
		p.product3();
		System.out.println(a);
		
	}
	
  public void product1()
  {
	  System.out.println("This is product 1");
  }
  public void product2()
  {
	  System.out.println("This is product 2");
	  
  }
  public void product3()
  {
	  System.out.println("This is product 3");
  }

}
