package string;

public class StartWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcd";
		String s2="abcd";
		
		boolean startswith=s1.startsWith(s2);
		System.out.println(startswith);
		
		boolean mystart=mystartwith(s1,s2);
		System.out.println(mystart);

	}

	private static boolean mystartwith(String s1, String s2) 
	{
		if(s2.length() <= s1.length())
		{
			int cnt=0;
			for (int i = 0; i < s2.length(); i++) 
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
				
			}
			if(cnt==s2.length())
			{
				return true;
				
			}
			
		}
		else
		{
			return false;
		}
		
		return false;
		
		
		
	}

}
