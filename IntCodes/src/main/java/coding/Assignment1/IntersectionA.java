package coding.Assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Collection;
import java.util.HashSet;
//import java.util.List;
//import java.util.List;
import java.util.Iterator;

//	public static String intersection(Integer[] nums1, Integer[] nums2) {

//		if (nums1 != null && nums2 != null) {
//			HashSet<Integer> hs = new HashSet<Integer>();
//			hs.addAll(Arrays.asList(nums1));
//
//			hs.retainAll(Arrays.asList(nums2));
//			System.out.println(hs);
//
//			 Integer[]	inter= {};
//			inter = hs.toArray(inter);
//			return Arrays.toString(inter);
//		}
//		return null;
//	}
public class IntersectionA {
	public static int[] intersection(int[] nums1, int[] nums2) {
		if ((nums1 != null && nums2 != null) && (nums1.length!=0 && nums2.length!=0)) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {
			if (set.contains(i)) {
				set1.add(i);
			}
		}

		int[] result = new int[set1.size()];
		int i = 0;
		for (int itr : set1) {
			result[i++] = itr;
		}
		return result;//Arrays.toString(result);
	}	
	return null;
	}
	public static void main(String args[]) {
		int nums1[] = {};
		int nums2[] = {};
		System.out.println(intersection(nums1, nums2));
	}
}
