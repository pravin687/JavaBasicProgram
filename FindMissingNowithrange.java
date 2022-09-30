package basicprogram;

public class FindMissingNowithrange {

	public static void main(String[] args) {
		
		int sum;
		int[] numbers = { 11,12,13,14,15,16,18 };
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
