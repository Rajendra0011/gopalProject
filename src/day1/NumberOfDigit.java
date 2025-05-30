package day1;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int count=0;
		int temp=num;
		
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
System.out.println(count);
	}

}
