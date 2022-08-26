package Collection.Scenarios;

import java.util.HashMap;
import java.util.Map;

public class RomanNo {

	public static int romanToInt(String s) {
		// char[] sa = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int sum = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		String st = s;
		for (int i = 0; i < st.length(); i++) {
         if(i>0 && map.get(st.charAt(i))>map.get(st.charAt(i-1))) {
        	 sum+=map.get(st.charAt(i))-2*map.get(st.charAt(i-1));
         }else {
        	 sum+=map.get(st.charAt(i));
         }
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));

	}

}
