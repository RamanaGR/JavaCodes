package coding.Assignment1;

public class SwapFirstLastCharacters { 
	//SwapFirstLastCharacters
	public static String count(String str) {
	
		char[] ch = str.toCharArray(); 
		for (int i = 0; i < ch.length; i++) { 
			int k = i; 
			while (i < ch.length && ch[i] != ' ') 
				i++; 
			char temp = ch[k];
			ch[k] = ch[i - 1]; 
			ch[i - 1] = temp; 
		} 
		return new String(ch); 
	} 
//public static StringBuilder  count(String str) {
//		
//		String[] tokens = str.split(" ");
//		
//		StringBuilder newString = new StringBuilder()   ;
//	
//		for (int i = 0; i < tokens.length; i++) { 
//			
//			
//			char[] ch = tokens[i].toCharArray() ; 
//			int j = tokens[i].length();
//			char temp = ch[j-1]; 
//			ch[j-1] = ch[0]; 
//			ch[0] = temp;  
//			
//			newString.append(new String (ch) + " ") ;
//		} 
//		return newString; 
//	
//	}
	public static void main(String[] args) 
	{ 
		String str = "Java is fun challenging"; 
		System.out.println(count(str)); 
	} 
} //write a program to swap 1st and last characters of each word in a given string?

