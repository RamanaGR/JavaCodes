package coding.Assignment1;

import java.util.Scanner;

public class PowerOfN {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter an integer number");
			int n = sc.nextInt();
			System.out.println(checkPowerNumber(n));
		}
		
		public static boolean checkPowerNumber(int n) {
			
			int count = 0;
			int temp = n;
			while(n!=1) {
				if(n%2==0) {
					count++;
					n = n/2;
				}
				else {
					n = n/2;
				}
			}
			n = temp;
			if(n == (int)Math.pow(2, count)) {
				return true;
			}
			else
				return false;
		}
	}

