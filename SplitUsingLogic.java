package string;

import java.util.Arrays;

public class SplitUsingLogic {

	public static void main(String[] args) {
		
		String s1="Bhavesh chakor mumbai";
		
		char ch=' ';
		int cnt=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)==ch)
			{
				cnt++;
			}
			
		}
		
		String[] sa=new String [cnt+1];
		String temp="";
		int index=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)!=ch)
			{
				temp=temp+s1.charAt(i);
			}
			else
			{
				sa[index++]=temp;
				temp="";
			}
			if(i==s1.length()-1)
			{
				sa[index++]=temp;
			}
			
			
		}
		
		System.out.println(Arrays.toString(sa));
		
		/*for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
			
		}*/
		
		

	}

}
