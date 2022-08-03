package logical;

public class LowerVowelCount {
	public static void main(String[] args) {
		String s = "LOgiCal REasOnINg";
		int lower = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				lower++;
			}
		}
		System.out.println(lower);
	}
}
