package coding.Assignment1;

public class Power {
	static boolean isPowerOfTwo(int n) 
	{ 

	    if(n==0) 

	    return false; 

	  

	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  

	       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	}
	public static void main(String[] args) {
		int n=16;
		System.out.println(Power.isPowerOfTwo(n));
		//System.out.println(Math.log(16) / Math.log(2));//2*2*2*2=16
	}
}
