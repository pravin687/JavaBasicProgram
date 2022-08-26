package basicprogram;

public class StringLength {

	public static void main(String[] args) {
		String s="length of the string";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
