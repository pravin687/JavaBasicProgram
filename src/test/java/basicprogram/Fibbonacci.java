package basicprogram;

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 0;
		int a=0;
		int b=1;
		int count=5;
		System.out.print(a+" "+b);
		for(int i=2;i<count;i++) {
			n=a+b;
			System.out.print(" "+n);
			a=b;
			b=n;
			
		}

	}

}
