package basicprogram;

public class SumOf1DArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int[] sum=runningSum(a);
		for(int i=0;i<sum.length;i++)
			System.out.print(sum[i]+",");
	}
	
	
	    public static int[] runningSum(int[] nums) {
	       int[] result=new int[nums.length];
	        result[0]=nums[0];
	        for(int i=1;i<nums.length;i++){
	            result[i]=result[i-1]+nums[i];
	        }
	        return result;
	    }
	      


}
