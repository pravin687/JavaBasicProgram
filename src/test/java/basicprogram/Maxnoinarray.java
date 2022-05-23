package basicprogram;

public class Maxnoinarray {

	public static void main(String[] args) {
		int[] a= {10,4,6,11,56};
		int max=0;
		max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {max=a[i];}
		}
		System.out.println(max);
	}

}
