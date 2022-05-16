package Collection.Scenarios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraystoArraylist {
	
	public static void main(String[] args) {
		String[] a={"Pravin","Anjali","Amish","Manisha"};
		//Array to list
		List l=Arrays.asList(a);
		Collections.sort(l);
		//for(String b:a)
		//System.out.println(b);
		//convert list to array
		Object[] c=l.toArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
	}

	
}
