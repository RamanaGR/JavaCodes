package coding.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Litmus {
	
		public static void main(String[] args) {
			//System.out.println("hello");
		List<String> employeeList = new ArrayList<String>();

		employeeList.add("Mark Thompson \n");
		employeeList.add("Daniel D'Souz");
		employeeList.add("Donald Renegeze");

		for(String employee: employeeList) {
		System.out.println(employee);
		employeeList.add("Lauren Philipose");
		}
		}
		
}
