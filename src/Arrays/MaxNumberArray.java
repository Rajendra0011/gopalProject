package Arrays;

public class MaxNumberArray 
{
	public static void main(String args[])
	{
		int a[][]= {{1,8,2},{31,5,6}};
		int max=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
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
