package coding.Assignment1;

import java.util.*;
import java.util.Map.Entry;

public class MaxCollection {
    public static void main(String[] args)
    {
        HashMap<String,Integer>map=new HashMap<String, Integer>();
        map.put("a", 50);
        map.put("b", 60);
        map.put("c", 30);
       // map.put(4, 60);
        //map.put(5, 60);
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Entry<String, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

    }
}