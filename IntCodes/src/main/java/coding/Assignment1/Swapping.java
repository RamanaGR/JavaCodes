package coding.Assignment1;
//Write a program to Swap two numbers in Java
public class Swapping {
public static void swap(int a, int b) {
	if( a==b ) {
		System.out.println(a+"  "+b);
			
	}
	else{
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a-->"+a+"  "+"after swapping b-->"+b);
		
	}

}
public static void main(String[] args) {
	int a=3,b=0;
Swapping.swap(a, b);
}
}
