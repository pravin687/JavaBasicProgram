package basicprogram;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("please enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number <= 1) {
			System.out.println("Not a Prime No");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Not a Prime No");
			}

		}
		System.out.println("Its a Prime No");
	}
}
