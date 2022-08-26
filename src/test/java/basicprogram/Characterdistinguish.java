package basicprogram;

public class Characterdistinguish {

	public static void main(String[] args) {
		String s = "asddfj 12345 #$%^& dfds  ADAAD";
		int cap = 0;
		int small = 0;
		int symbol = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				cap++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				small++;
			} else {
				symbol++;
			}
		}

		System.out.println(cap);
		System.out.println(small);
		System.out.println(symbol);

	}

}
