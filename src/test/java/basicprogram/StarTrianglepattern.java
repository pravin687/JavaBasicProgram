package basicprogram;

public class StarTrianglepattern {
//
	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
