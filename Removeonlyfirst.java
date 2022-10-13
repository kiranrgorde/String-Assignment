package string;

public class Removeonlyfirst{

	public static void main(String[] args) 
	{
		String s="abcfsfafgfasdg";
		String s1="";
		char ch='a';
		
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==ch && cnt<1)
			{
				cnt++;
				continue;
			}
			else
			{
				s1+=s.charAt(i);
			}
		}
		
		System.out.println(s1);
		

	}

}
