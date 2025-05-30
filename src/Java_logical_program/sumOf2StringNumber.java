package Java_logical_program;

public class sumOf2StringNumber {

	public static void main(String[] args) 
	{
		String s1="#10";
		String s2="#20";
		String s3;
		
		int num1=Integer.parseInt(s1.replace("#",""));
		 int num2=Integer.parseInt(s2.replace("#",""));
		 
		 int sum=num1+num2;
		 
		 s3="#"+sum;
		 System.out.println(s3);
		 

	}

}
