package string;

public class CheakNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="12345";
		
		char[] ch=s1.toCharArray();
		
		int cnt=0;
		
		for (int i = 0; i < ch.length; i++)
		{
		
			if(ch[i]>='0' && ch[i]<='9')
			{
				cnt++;
			}
			
		}
		if(cnt==ch.length)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
