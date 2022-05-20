package Collection.Scenarios;

import java.util.Stack;

public class Stackprog {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		System.out.println(s);
		System.out.println(s.lastElement());
	}

}
