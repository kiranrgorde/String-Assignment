package string;

public class SortingStringbyLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to java programming";

		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) 
		{
			for (int j = i+1; j < s1.length; j++)
			{
				if(s1[i].length() >s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
				
			}
			
			
		}
		for (int j = 0; j < s1.length; j++) 
		{
		
			System.out.println(j+" "+s1[j]);
		}

	}

}
