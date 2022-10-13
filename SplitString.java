package string;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welocome to java programming";
		
		String[] s1=s.split(" ");
		
		for (String string : s1) {
			System.out.println(string);
		}
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+" "+i);
		}
 	}

}
