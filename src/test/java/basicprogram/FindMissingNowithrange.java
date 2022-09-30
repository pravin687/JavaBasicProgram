package basicprogram;

import java.util.Arrays;

public class FindMissingNowithrange {

	public static void main(String[] args) {
		
		int sum;
		int[] numbers = { 18,15,17,20,16,14 };
		//sorting array
		Arrays.sort(numbers);
		int total;
		int length=numbers.length;
		int firstNo=numbers[0];
		int lastNo=numbers[length-1];
		sum=firstNo;
		total=sum;
		for(int i=1;i<=length;i++) {
			
			total=total+1;
			
			if(total==numbers[i]) {
				continue;
			}else {
				System.out.println("missing no:"+total);
				break;
			}
			
		}
		
        
	}

}
