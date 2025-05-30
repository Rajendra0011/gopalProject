package Arrays;

public class minimumNumberfromArray 
{
	public static void main(String args[])
	{
		int abc[][]= {{13,3,5},
				{6,8,9},
				{12,22,9}};
		int min=abc[0][0];
		
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				
				if(abc[i][j]<min )
				{
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
		
	}

}
