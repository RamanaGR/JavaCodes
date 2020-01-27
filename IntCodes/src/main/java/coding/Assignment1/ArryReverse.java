package coding.Assignment1;

public class ArryReverse {
	public static void main(String args[]) {
int [] a= {1,2,3,5,6,4,8,9};
reverse(a);
}
	static void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
    for(int w:array) {
    	System.out.println(w);
    	}
}
}