package string;

public class StringMethod
{
	public static void main(String[] args) 
	{
		String s="Welcome";
		
		s=s.concat(" to java");
		
		s=s.toLowerCase();//method for all convert string in lowercase
		System.out.println(s);
		
		s=s.toUpperCase();//method for all convert string in uppercase
		System.out.println(s);
		
		s=s.replace("E", "*");//replace
		System.out.println(s);
		
		System.out.println(s.contains("TO"));
		
	}

}
