package Collection.Scenarios;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetandTreeset {

	public static void main(String[] args) {
		//Stores hetrogenous order.order is not mainatined
		HashSet hs=new HashSet();
		//Stores homogenous order and it give output in sort
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		hs.add(20);
		hs.add(1);
		hs.add(0);
		hs.add(40);
		hs.add(-40);
		hs.add('A');
		
		ts.add(2);
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(-40);
		
		System.out.println(hs);
		System.out.println(ts);
	}

}
