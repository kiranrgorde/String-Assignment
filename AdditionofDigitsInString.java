package string;

public class AdditionofDigitsInString 
{

	public static void main(String[] args)
	{
		
		String s="acvf2flk4kdjf9";
		int sum=0;
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int num=s.charAt(i)-48;
				sum=sum+num;
				cnt++;
			}
			
		}
		if(cnt==0)
		{
			System.out.println("no digit in string");
		}
		else
		{
			System.out.println("addition of string is: "+sum);
		}
	}

}
