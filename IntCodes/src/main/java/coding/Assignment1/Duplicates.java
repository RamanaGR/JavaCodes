package coding.Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//Write a Program to find Duplicate elements from a given string
public class Duplicates {
	public static String getDuplicates(String input) {

		if (input == null || input.length() < 1) {

			return null;
		} else {

		char[] chars = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (char c : chars) {

				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}}
//				for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//					System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
//				}
			
			String output = "";
			for (Entry<Character, Integer> pair : map.entrySet()) {
				// System.out.println(pair.getKey() + "---" + pair.getValue());

				if (pair.getValue() > 1) {
				
					output = output + pair.getKey();
					
				}
				
			}
		
			return output;
			
		}
		
	}
		

	public static void main(String[] args) {
		String str = "aabbcc";
		System.out.print(getDuplicates(str));
	}
}
