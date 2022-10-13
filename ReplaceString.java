package string;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aebecede";
		
		char ch1='e';
		char ch2='*';
		
		String sResult="";
		
		for (int i = 0; i < s.length(); i++)
		{		
			if(s.charAt(i)==ch1)
			{
				sResult=sResult+ch2;
			}
			else
			{
				sResult=sResult+s.charAt(i);
			}
		}
		System.out.println(sResult);
				
	}

}
