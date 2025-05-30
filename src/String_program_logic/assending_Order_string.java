package String_program_logic;

import java.util.Arrays;

public class assending_Order_string {

	public static void main(String[] args) 
	{
	  String s="ebcda";
	  
	  //1.approach 1
	  char ch[]=s.toCharArray();
	  
	  for(int i=0;i<ch.length;i++)
	  {
		  for(int j=i+1;j<ch.length;j++)
		  {
			  if(ch[i]>ch[j])
			  {
				  char temp;
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			  }
		  }
			System.out.print(ch[i]);

	  }
	  
	  
	  
	  System.out.println("");
	  
	  //2.approach 2
	  
	  
	  String st="cbefdagthpo";
	  char []charAr=st.toCharArray();
	  Arrays.sort(charAr);
 	  System.out.println(charAr);
	    
	}

}
