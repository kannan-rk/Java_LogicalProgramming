package logical;

public class UpperVowelCount {
	public static void main(String[] args) {
		String s = "LOgiCal REasOnINg";
		int upper = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				upper++;
			}
		}
		System.out.println(upper);
	}
}
