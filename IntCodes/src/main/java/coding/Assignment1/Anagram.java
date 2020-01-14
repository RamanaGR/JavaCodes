package coding.Assignment1;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
//Program to check if two Strings are anagrams of each other?
//Anagram:a word or phrase made by using the letters of another word or phrase in a different order
public class Anagram {
	public static void main(String[] args) {
			String str = "bad credit";
			String str1 ="debit card" ;
		
			System.out.println(anag(str, str1));
		}

		public static boolean anag(String a, String b ) {
		
//		Map<Character, Integer> dp = new HashMap<Character, Integer>();
//		Map<Character, Integer> dp1 = new HashMap<Character, Integer>();
//		
//			if (str1.length()==str.length()) {
//				
//				char[] ch = str.toLowerCase().toCharArray();
//				for (char c : ch) {
//					if (dp.containsKey(c)) {
//						dp.put(c, dp.get(c) + 1);
//					} else {
//						dp.put(c, 1);
//					}
//				}
//				
//				System.out.println(dp);
//
//				char[] ch2 = str1.toLowerCase().toCharArray();
//
//				for (char c1 : ch2) {
//
//					if (dp1.containsKey(c1)) {
//						dp1.put(c1, dp1.get(c1) + 1);
//					}else {
//						dp1.put(c1, 1);
//					}
//					
//				}	
//				
//				if (dp.equals(dp1)) {
//					return true;
//				}
//			
//			}
//				
//		
//			return false;
//		}


		//static boolean isAnagram(String a, String b) {
		    if (a.length() != b.length()) 
		    	return false;
		    a = a.toLowerCase();
		    b = b.toLowerCase();

		    char[] charA = a.toCharArray();
		    Arrays.sort(charA);

		    char[] charB = b.toCharArray();
		    Arrays.sort(charB);

		    return Arrays.equals(charA, charB);
		}
}