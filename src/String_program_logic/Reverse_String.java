package String_program_logic;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String str="gopal";
		
		//1.approach 1
		char []ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
		}
		System.out.println(" ");
		
		//2.approach 2
		
		StringBuilder sb1=new StringBuilder(str);
		sb1.reverse();
		System.out.println(sb1);
		
		//3.approach 2
		
				StringBuffer sb3=new StringBuffer(str);
				sb3.reverse();
				System.out.println(sb3);
		 
	}

}
