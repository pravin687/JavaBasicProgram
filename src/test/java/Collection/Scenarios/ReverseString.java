package Collection.Scenarios;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="pravin";
      char[] c=s.toCharArray();
      Stack st=new Stack();
      for(char ch:c) {
    	  st.push(ch);
    	  
      }
      int l=st.size();
      //System.out.println(st.size());
      for(int i=1;i<=l;i++) 
      System.out.println(st.pop());
	}

}
