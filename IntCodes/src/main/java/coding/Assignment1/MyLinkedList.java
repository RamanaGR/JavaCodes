package coding.Assignment1;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");
		ls.add("6");
		ls.add("7");
		ls.add("8");
		ls.add("9");
		
		System.out.println("Middle element is: "+ls.get(ls.size()/2));
		
	}

}