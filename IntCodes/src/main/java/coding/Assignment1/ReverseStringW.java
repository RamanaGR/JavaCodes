package coding.Assignment1;

//Program to reverse words in a sentence without using a library method?
//public class ReverseStringW {
//	public static void main(String[] args) {
//		String str = "practice programs well";
//		System.out.println(reverString(str));
//	}
//
//	public static String reverString(String str) {
//		if (str != null) {
//			String rev = "";
//			String a[] = str.split(" ");
//			for (int i = a.length - 1; i >= 0; i--) {
//				rev += a[i] + " ";
//			}
//			// System.out.println(rev);
//			return rev;
//
//		}
//		return null;
//	}
//
//}
public class ReverseStringW
{
   public static String reverseWord(String str)
   {if(str!=null) {
	
	String[] w = str.split(" ");
	String revString = "";
	for (int i = 0;i<w.length;i++)
        {
           String word = w[i]; 
           String rw = "";
           for(int j=word.length()-1;j>=0;j--) 
	   {
		rw = rw + word.charAt(j);
	   }
	   revString = revString + rw + " ";
	}
	//System.out.println(str);
	System.out.println(revString);
	return revString;
   }
   else {
	   return null;
   }}
//   public static String reverseWord(String str){  
//	    String words[]=str.split(" ");  
//	    String reverseWord="";  
//	    for(String w:words){  
//	        StringBuilder sb=new StringBuilder(w);  
//	        sb.reverse();  
//	        reverseWord+=sb.toString()+" ";  
//	    }  
//	    return reverseWord.trim();  
//	}
   
   public static void main(String[] args) {
	   String str="i am learning automation";
	   //ReverseStringW dd=new ReverseStringW();
	   System.out.print(ReverseStringW.reverseWord(str));
}
}