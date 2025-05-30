package Arrays;

import java.util.ArrayList;

public class uniqueNumberArray 
{
	public static void main(String args[])
	{
		int a[]= {2,5,2,2};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++ )
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
//				System.out.println(a[i]);
//				System.out.println(k);
				if(k==1)
					System.out.println(a[i]+" : unique number");
			}
			
		}
	}

}
