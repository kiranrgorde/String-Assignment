package string;
import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String s="You all are very very good students";
		
		String[] sa=s.split(" ");
		
		int i=0;
		int j=sa.length-1;
		
		while(i<j)
		{
			String temp=sa[i];
			sa[i]=sa[j];
			sa[j]=temp;
			
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(sa));//String array
		
		
		String s1="";
		
		for (int k = 0; k < sa.length; k++) 
		{
			if(k<sa.length-1)
			{
				s1=s1+sa[k]+" ";
			}
			else
			{
				s1=s1+sa[k];
			}
			
		}
		System.out.println(s1);//for string

	}

}
