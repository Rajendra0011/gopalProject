package Loops;

public class maxNumberArray 
{
	public static void main(String args[])
	{
		int a[][]={{277,5,886},{12,322,966},{5,6,15}};
		int max=a[0][0];
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
