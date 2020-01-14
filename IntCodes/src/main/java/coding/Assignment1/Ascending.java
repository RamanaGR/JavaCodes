package coding.Assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ascending {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/vedangwhitebox/Desktop/Vedang/New/IntCodes/Files/PhoneNumbers.txt");
		FileReader fr = new FileReader(f);
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String str = "";
		while ((str = br.readLine()) != null) {

			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}

		}
	
		Set<Entry<String, Integer>> entrys = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrys);
		Collections.sort(list, new MyComparator());
		
		for(Map.Entry<String, Integer> entry :list) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}

class MyComparator implements Comparator<Map.Entry<String, Integer>> {

	public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
		
		return obj1.getValue().compareTo(obj2.getValue());
	}
	
}