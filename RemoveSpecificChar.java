package string;

public class RemoveSpecificChar {

	public static void main(String[] args) 
	{
		String s="abacfsfafgfasdg";
		String s1="";
		char ch='a';
		int num=2;
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				cnt++;
				if(cnt!=num)
					s1+=s.charAt(i);
			}
			else
			{
				s1+=s.charAt(i);
			}
			
		}
		
		System.out.println(s1);
		

	}


}
