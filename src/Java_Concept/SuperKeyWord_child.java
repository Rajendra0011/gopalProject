package Java_Concept;

public class SuperKeyWord_child extends SuperKeyWord_parent
{
	
	String name ="karhale Academy";
	public void geStringtData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public void getdata()
	{
		super.getdata();
		System.out.println("This is child class");
		
	}
	
	//constructer
	public SuperKeyWord_child()
	{
		super();
		System.out.println("This is child class constructer hai");
	}
	
	public static void main(String args[])
	{
		
		SuperKeyWord_child s=new SuperKeyWord_child();
		s.geStringtData();
		s.getdata();
		
	}
	

}
