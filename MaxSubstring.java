package string;

public class MaxSubstring
{

    public static void main(String[] args)
    {
	String s="abcdefabcdabc";
	String maxString="";
	for (int i = 0; i < s.length(); i++)
	{
	    for (int j = 0; j <= s.length(); j++)
	    {
		String str=mySubString(s,i,j);
		if(noRepeatingchar(str))
		{
		    if(str.length()>maxString.length())
		    {
			maxString=str;
		    }
		}
		
	    }
	}
	System.out.println(maxString);

    }
    
    private static String mySubString(String s, int i, int j)
    {
	String str="";
	for (int k = i; k < j; k++)
	{
	    str+=s.charAt(k);
	}
	return str;
    }


    private static boolean noRepeatingchar(String str)
    {
	
	for (int i = 0; i < str.length(); i++)
	{
	    for (int j = i+1; j < str.length(); j++)
	    {
		if(str.charAt(i)==str.charAt(j))
		{
		    return false;
		}
	    }
	}
	return true;
    }

   
}
