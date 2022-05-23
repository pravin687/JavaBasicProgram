package Collection.Scenarios;

import java.util.HashSet;

public class Firstrepaetedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="valley";
      char[] c=str.toCharArray();
      System.out.println(repeatchar(c));
	}

	public static char repeatchar(char[] c) {
		
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<c.length;i++) {
			char s=c[i];
			/*if(hs.contains(s)) {
				return s;
			}else {
				hs.add(s);
			}*/
			if(!hs.add(s)) {
				return s;
			}
		}
		return '0';
	}

	
}
