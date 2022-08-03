package logical;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "MOM";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
