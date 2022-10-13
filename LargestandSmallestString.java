package string;

public class LargestandSmallestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to java programming";

		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++)
		{
			for (int j = i+1; j < s1.length; j++)
			{
				if(s1[i].length()> s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
			
		}
		
		for (int i = 0; i < s1.length; i++)
		{
		
			System.out.println(i+" "+s1[i]);
		}
		
		
		System.out.println("Largest String: "+s1[3]);
		System.out.println("Smallest String: "+s1[0]);
	}

}
