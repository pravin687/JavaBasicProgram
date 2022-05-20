package basicprogram;

public class Amstrongnumber {
/*What is an Armstrong Number? 
 * A number is thought of as an Armstrong number if the sum 
 * of its own digits raised to the power number of digits 
 * gives the number itself. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int num=0;
		int sum=0;
		while(n>0) {
		num=n%10;
		n=n/10;
		sum=sum+(num*num*num);
		}
		System.out.println(sum);
		

	}

}
