package coding.Assignment1;

public class WAPHalfsort {

	public static void main(String args[]) {
		char[] characters = { 'a', 'b', 'f', 'c', 'g', 't', 'h', 'j', 'u', 'k' };
		System.out.println(meth(characters));

	}

	public static char[] meth(char[] c) {
		if (c != null&&c.length!=0) {
			int i;
			for (i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					char temp;
					if (c[i] > c[j]) {
						temp = c[i];
						c[i] = c[j];
						c[j] = temp;
					}
				}

			}
			return c;

		}
		return null;

	}
}
