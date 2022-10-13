package string;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdef";
		
		char ch='d';
		String s1="";
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)!=ch)
			{
				s1=s1+s.charAt(i);
			}
			
		}
		System.out.println(s1);

	}

}
