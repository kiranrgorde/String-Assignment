package string;

public class CompareString {

	public static void main(String[] args) {
		
		String s1="Hefshine";
		String s2="hefshine";
		
		int num=s1.compareTo(s2);
		System.out.println(num);
		
		int num2=MyCompareTo(s1,s2);
		System.out.println(num2);
		

	}

	private static int MyCompareTo(String s1, String s2) 
	{
		for(int i=0; i<s1.length()&& i<s2.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
			
		}
		
		
		return s1.length()-s2.length();
		
		
		
	}

}
