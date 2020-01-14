package coding.Assignment1;

import java.util.Arrays;

public class Sets {
	
	public static int[] setSub(int[] a, int[] b) {

		if (a != null) {

			if (b == null) {
				return a;
			} 
			else {
				String sb = Arrays.toString(b);
				
				int[] in=new int[b.length];
				
				for (int i = 0; i < a.length; i++) {
					//System.out.println(sb);
					if (sb.indexOf(String.valueOf(a[i])) > -1) {
						//in[i]=a[i];
					}else {
					
						in[i]=a[i];
						//System.out.println(a[i]);
					}
				}
				return in;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] a = {2,4,6,8};
		int[] b = {4,8,1};
		int[] result = Sets.setSub(a, b);
		for(int op : result) {
		System.out.println(op);	
		}
	}
}

//for(int i=0;i<setb.length();i++) {
//System.out.println(setb.charAt(i));
//}

//for (int i = 0; i < a.length; i++) {
////System.out.println(a[i]);
//if (setb.indexOf(a[i])>-1) {
//	
//		System.out.println(a[i]);
//	}
//else {
//	System.out.println(a[i]);
//}
//
//}
