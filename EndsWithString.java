package string;

public class EndsWithString {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "ad";

		boolean endswith = s1.endsWith(s2);
		System.out.println(endswith);

		boolean endswith2 = endswithmethod(s1, s2);
		System.out.println(endswith2);
	}

	private static boolean endswithmethod(String s1, String s2) {
		if (s2.length() <= s2.length()) {
			int s1Index = s1.length() - 1;
			int s2Index = s2.length() - 1;
			int cnt = 0;
			while (s2Index >= 0) {
				if (s1.charAt(s1Index) == s2.charAt(s2Index)) {
					cnt++;
				}
				s2Index--;
				s1Index--;
			}
			if (s2.length() == cnt) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

}
