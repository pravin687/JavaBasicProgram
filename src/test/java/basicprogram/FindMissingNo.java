package basicprogram;

public class FindMissingNo {

	public static void main(String[] args) {
		//only if no is in sequence and start from 1
		int[] numbers = { 1,2,3,4,5,6,8 };
		int length = numbers.length+1;//we have mentioned 1+ because 
		//one number is missing
		System.out.println(length);
        int sum=  (length*(length+1))/2;
        System.out.println(sum);
        int sumofarrayelement=0;
        for(int i=0;i<length-1;i++) {
        	sumofarrayelement=sumofarrayelement+numbers[i];
        }
        System.out.println(sumofarrayelement);
       System.out.println(sum-sumofarrayelement);
        	
        
	}

}
