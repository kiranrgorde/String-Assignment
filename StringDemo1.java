package string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Bhavesh";
		//one way
		char[] ch=s.toCharArray();//convert string to array
		
		for (int i = 0; i < ch.length; i++)
		{
		
			System.out.println(i+" "+ch[i]);
		}
		
		// second  way
		for (int i = 0; i < s.length(); i++)
		{
		
			System.out.println(i+" "+s.charAt(i));//print direct using charAt method
			
		}
		int[] _af= {1,1,1,2,3};
		
		

	}

}
