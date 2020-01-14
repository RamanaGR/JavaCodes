package coding.Assignment1;

import java.util.HashSet;

public class SubtSet {
	public static void setSubtract(int[] a, int[] b) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int p : b) {
			hs.add(p);
		}
		for (int k : a) {
			if (hs.add(k)) {
				System.out.println(k);
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 9, 5, 6, 8 };
		int[] b = { 5, 6, 2 };
		SubtSet.setSubtract(a, b);

	}
}
