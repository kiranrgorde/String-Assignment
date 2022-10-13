package string;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="HefShine";
		String s2="HefShine";
	
		System.out.println(s1.toLowerCase());
	
		s2=myTolowercase(s2);
		System.out.println(s2);

	}

	private static String myTolowercase(String s2)
	{
	
		String s="";
		for(int i=0; i<s2.length(); i++)
		{
			
			char ch=s2.charAt(i);
			if(ch>='A' && ch<='Z')
				ch=(char)(ch+32);
				
			s=s+ch;
		}
		return s;
	}

}
