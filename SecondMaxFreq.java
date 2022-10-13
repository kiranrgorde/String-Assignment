package string;

public class SecondMaxFreq
{

    public static void main(String[] args)
    {
	String s = "ababacfd";
	int size = 0;
	for (int i = 0; i < s.length(); i++)
	{
	    int cnt = 0;
	    for (int j = 0; j < i; j++)
	    {
		if (s.charAt(i) == s.charAt(j))
		    cnt++;
	    }
	    if (cnt == 0)
	    {
		size++;
	    }
	}

	char[] ca = new char[size];
	int[] fa = new int[size];
	int index = 0;
	for (int i = 0; i < s.length(); i++)
	{
	    int count = 0;
	    for (int j = 0; j < i; j++)
	    {
		if (s.charAt(i) == s.charAt(j))
		    count++;
	    }
	    if (count == 0)
	    {
		int freq = 0;
		for (int j = 0; j < s.length(); j++)
		{
		    if (s.charAt(i) == s.charAt(j))
		    {
			freq++;
		    }
		}
		ca[index] = s.charAt(i);
		fa[index] = freq;
		index++;
	    }
	}
	for (int i = 0; i < ca.length; i++)
	{
	    for (int j = i + 1; j < ca.length; j++)
	    {
		if (ca[i] < ca[j])
		{
		    char temp = ca[i];
		    ca[i] = ca[j];
		    ca[j] = temp;

		    int temp1 = fa[i];
		    fa[i] = fa[j];
		    fa[j] = temp1;
		}
	    }
	}

	System.out.println(ca[ca.length - 2] + " " + fa[fa.length - 2]);

    }

}
