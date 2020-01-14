package coding.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class App{
	public static void main(String[] args) {
		
	

		String first = new String("Number one");
		String second = new String("Number one");
		String third = first;
		System.out.println(first == second);
		System.out.println(first.equals(second));
		System.out.println(second == third);
		System.out.println(second.equals(third));
	}
}
//a. first == second

//b. first.equals(second)

//c. first == third

//d. second.equals(third)