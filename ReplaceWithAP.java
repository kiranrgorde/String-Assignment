package string;

public class ReplaceWithAP {

	public static void main(String[] args) 
	{
		String s1="bhamesh";
		System.out.println(s1);
		
		String s2=myReplaceWithMethod(s1,'m','v');
		System.out.println(s2);
		
}

	private static String myReplaceWithMethod(String s1, char oldchar, char newchar)
	{
		String s2="";
		
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch==oldchar)
			{
				s2=s2+newchar;
			}
			else
			{
				s2=s2+ch;
			}
			
		}
		return s2;
		
	}
}