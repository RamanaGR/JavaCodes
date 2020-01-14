package coding.Assignment1;

public class DuplicatesFor {
public static String duplicate(String str) {
	if(str!=null) {
		String strd="";
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++)
			if(str.charAt(i)==str.charAt(j)) {
				 strd=strd+str.charAt(i);
				//System.out.println(str.charAt(i));
			}
				
		}
		return strd;
	}
	
	return null;
	
}
public static void main(String args[]) {
	System.out.println(duplicate("PAYPAL"));
} 
}
