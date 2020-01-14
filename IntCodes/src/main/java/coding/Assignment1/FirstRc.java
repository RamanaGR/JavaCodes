package coding.Assignment1;


import java.util.LinkedHashMap;
import java.util.Map;

//Program to return first non repeated character from String?
public class FirstRc {
	
	public static void main(String[] args) {
		String str = "Access";
		System.out.println(nonRc(str));
	}

	public static char nonRc(String str) {

		if (str != null) {

			LinkedHashMap<Character, Integer> hp = new LinkedHashMap<Character, Integer>();
			char[] c = str.toCharArray();

			for (char ch : c) {

				if (hp.containsKey(ch)) {
					hp.put(ch, hp.get(ch) + 1);
				} else {
					hp.put(ch, 1);
				}

			}

			for (Map.Entry<Character, Integer>entrys : hp.entrySet()) {

				if (entrys.getValue() == 1) {

					return entrys.getKey();
				}
			}
		}

		return 0;

	}
}
