package day1;

public class reverseNumber {

	public static void main(String[] args) 
	{
	 int num=12345;
	 
	 int remd,sum=0;
	 
	 while(num>0)
	 {
		 remd=num%10;
		 sum=(sum*10)+remd;
		 num=num/10;
	 }
	 System.out.println(sum);
	 
	}

}
