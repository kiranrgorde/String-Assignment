package string;

public class DuplicateString
{

    public static void main(String[] args)
    {
	String s = "abcabcdaca";//
	String str = "";
	int count = 0;
	for (int i = 0; i < s.length(); i++)
	{

	    int cnt = 0;
	    for (int j = 0; j < i; j++)
	    {
		if (s.charAt(i) == s.charAt(j))
		{
		    cnt++;
		}
	    }
	    if (cnt != 0)
	    {
		str += s.charAt(i);
		count++;
	    }
	}
	System.out.println(str);
	System.out.println(count);
    }

}
