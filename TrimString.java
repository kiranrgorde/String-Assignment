package string;

public class TrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="  Bhavesh bhai   ";
		//System.out.println(s);
		
		int start =0;
		int end=s.length()-1;
		
		while(true)
		{
			if(s.charAt(start)==' ')
			{
				start++;
			}
			else if(s.charAt(end)==' ')
			{
				end--;
			}
			else
			{
				break;
			}
		}
		String s1="";
		for (int i = start; i <= end; i++)
		{
			s1=s1+s.charAt(i);
			
		}
		
		System.out.println(s1);
	
	}

}
