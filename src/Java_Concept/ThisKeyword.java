package Java_Concept;

public class ThisKeyword 
{
	int a=2;
	
	public void keyword()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		int c=a+this.a;
		System.out.println(c);
		
	}

	public static void main(String args[])
	{
		ThisKeyword t=new ThisKeyword();
		t.keyword();
	}
}
