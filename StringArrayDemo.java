package string;

public class StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome";//create string using literals

		System.out.println(s1.length());

		char[] ch = s1.toCharArray();//for converting string to char array

		for (char c : ch)//print char array using for each loop instance of for loop
		{
			System.out.print(c);
		}

	}

}
