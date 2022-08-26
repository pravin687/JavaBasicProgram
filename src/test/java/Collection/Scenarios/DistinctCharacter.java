package Collection.Scenarios;

import java.util.HashSet;

public class DistinctCharacter {

	public static void main(String[] args) {
		
		String s="aabbbcccdjfjff";
		char[] c=s.toCharArray();
		HashSet hs=new HashSet();
		for(char ch:c) {
	
			hs.add(ch);
		}
		System.out.println(hs);
     
	}

}
