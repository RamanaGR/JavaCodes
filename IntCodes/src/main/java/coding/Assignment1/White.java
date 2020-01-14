package coding.Assignment1;

public class White {
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	String str="java is divesh";
	char[] ch=str.toCharArray();
String s="";
	for(int i =0;i<ch.length;i++) {
		//System.out.println(ch[i]);
	if(ch[i]!=' ') {
		s=s+ch[i];
		
	}
	}
	System.out.println(s);
}
	
}
