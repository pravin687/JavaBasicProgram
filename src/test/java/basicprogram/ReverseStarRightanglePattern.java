package basicprogram;

public class ReverseStarRightanglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
