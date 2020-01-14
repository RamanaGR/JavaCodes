package coding.Assignment1;
//Program to check if String is Palindrome?
public class Palindrome {
public static void main(String[] args) {
	String str="@#$#@";
	System.out.println(palin(str));
}


public static boolean palin(String str) {
	
	if(str==null || str.isEmpty()) {
		return false;
	}else {
		int str1=str.length();
		System.out.println(str1);
		int indexlen=str.length()-1;
		for (int i=0;i<indexlen/2;i++) {
			if(str.charAt(i)!=str.charAt(indexlen-i)) {
				return false;
			}
		}
	}
	return true;
	
}
}
