package String_program_logic;

public class StringMethod 
{
	public static void main(String args[])
	{
		String s1="Automations";
		String s2="selenium";
		String s3="Automations";
		String s4="Testing java";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		//1.compair string
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//print character
		System.out.println(s1.charAt(0));//A
		System.out.println(s1.charAt(5));// a
		
		//3 concat 2 string
		System.out.println(s1.concat(s4));
		
		//4.String index 
		System.out.println(s4.indexOf("t"));  //3
		System.out.println(s4.indexOf("ting")); //3
		
		//5.endWith
		
		System.out.println(s4.endsWith("va")); //true
		System.out.println(s4.startsWith("Test")); // true
		
		//6.SubString
		String a="Seleium with java";
		
		System.out.println(a.substring(8)); // with java
		
		
		
		
		
	}

}
