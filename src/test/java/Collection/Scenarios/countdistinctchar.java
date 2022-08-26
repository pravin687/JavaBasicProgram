package Collection.Scenarios;

import java.util.SortedSet;
import java.util.TreeSet;

public class countdistinctchar {

	public static void main(String[] args) {
		
		String s="sdfsdgfdgdFDGFHfvxcHGGHFyowqHJHJGHyADSFdsjsfs";
		char[] c=s.toCharArray();
        TreeSet ts=new TreeSet();
        for(int i=0;i<c.length;i++) {
        	ts.add(c[i]);
        }
        System.out.println(ts);
       SortedSet small= ts.subSet('a', 'z');
       SortedSet Capital= ts.subSet('A', 'Z');
      System.out.println(small.size());
      System.out.println(Capital.size());
	}

}
