package coding.Assignment1;

public class StringLength{
public static void main(String[] args) {
	String s= "HelloAll";
	
	System.out.println(StringLength.lenghtOfStr(s));
}
static int lenghtOfStr(String str) {
	int i=0;
	for(char c:str.toCharArray()) {
		i++;
	}
	
	return i;
}
}
