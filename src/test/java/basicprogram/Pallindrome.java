package basicprogram;

public class Pallindrome {

	public static void main(String[] args) {

		String s = "nitkn";
		String s1 = "";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			s1 = s1 + c[i];
		}

		if (s.equals(s1))
			System.out.println("its pallindrome");
		else
			System.out.println("its not a pallindrome");

	}

}
