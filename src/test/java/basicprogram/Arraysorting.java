package basicprogram;

public class Arraysorting {

	public static void main(String[] args) {
	    int temp;
		int[] a= {56,23,4,5,7,9,23,45,78,65,99};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				 if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
			}
		}
		//for(int k=0;k<a.length;k++) {
			System.out.println(a[a.length-2]);
		//}
       
	}

}
