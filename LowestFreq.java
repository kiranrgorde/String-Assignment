package string;

public class LowestFreq
{

    public static void main(String[] args)
    {

	String s = "adscagsdaadbbcd";
	int min = Integer.MAX_VALUE;
	char ch = 0;
	for (int i = 0; i < s.length(); i++)
	{
	    int cnt = 0;
	    for (int j = 0; j < i; j++)
	    {
		if(s.charAt(i)==s.charAt(j))
		{
		cnt++;
		break;
		}
	    }
	    if (cnt == 0)
	    {
		int freq = 0;
		for (int j = 0; j < s.length(); j++)
		{
		   if(s.charAt(i)==s.charAt(j))
		   {
		       freq++;
		   }
		}
		if (freq<min)
		{
		    min = freq;
		    ch = s.charAt(i);
		}

	    }

	}
	System.out.println(ch+" "+min);

    }

}
