package Collection.Scenarios;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String s = "aavvffddssgghrsaasdkf";
         char[] c=s.toCharArray();
         HashMap<Character,Integer> map=new HashMap<Character,Integer>();
         for(char ch:c) {
        	 if(map.containsKey(ch)) {
        		 map.put(ch, map.get(ch)+1);
        	 }else {
        		 map.put(ch, 1);
        	 }
         }
         for(Map.Entry<Character, Integer> entry:map.entrySet()) {
        	 System.out.println(entry.getKey() +":"+entry.getValue());
         }

	}

}
