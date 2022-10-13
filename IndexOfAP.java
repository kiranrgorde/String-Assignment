package string;

public class IndexOfAP
{

    public static void main(String[] args)
    {
	String s1 = "abcdefghi";
	String s2 = "fghi";

	int result1 = s1.indexOf(s2);
	System.out.println(result1);

	int result2 = myIndexOfMethod(s1, s2);
	System.out.println(result2);
    }

    private static int myIndexOfMethod(String s1, String s2)
    {
	if (s2.length() > s1.length())
	    return -1;

	for (int i = 0; i < s1.length(); i++)
	{
	    if (s1.charAt(i) == s2.charAt(0))
	    {
		int j = i + 1;
		int k = 1;
		int cnt = 1;

		while (j < s1.length() && k < s2.length())
		{
		    if (s1.charAt(j) == s2.charAt(k))
		    {
			cnt++;
		    } else
		    {
			break;
		    }
		    j++;
		    k++;

		}
		if (cnt == s2.length())
		{
		    return i;
		}

	    }

	}

	return -1;

    }

}
