package string;

public class ToUpperCaseAC {

	public static void main(String[] args) {
		
		
		String s="BhaveSH";
		
		String lower1=s.toLowerCase();
		System.out.println("java ans :"+lower1);
		
		String lower2=mylower(s);
		System.out.println("Own Logic :"+lower2);

	}

	private static String mylower(String s) 
	{
	
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
		
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				char ch=(char)(s.charAt(i)+32);
				s1=s1+ch;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		return s1;
	}

}
