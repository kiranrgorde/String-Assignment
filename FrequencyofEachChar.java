package string;

public class FrequencyofEachChar
{
    public static void main(String[] args)
    {
	String s = "adscasdadbbcdc";
	for (int i = 0; i < s.length(); i++)
	{
	    int cnt = 0;
	    for (int j = 0; j < i; j++)
	    {
		if (s.charAt(i) == s.charAt(j))
		{
		    cnt++;
		    break;
		}
	    }
	    if (cnt == 0)
	    {
		int count = 0;
		for (int j = 0; j < s.length(); j++)
		{
		    if (s.charAt(i) == s.charAt(j))
		    {
			count++;
		    }

		}
		System.out.println(s.charAt(i) + " " + count);
	    }

	}

    }

}
