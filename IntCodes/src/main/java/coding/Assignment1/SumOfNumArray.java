package coding.Assignment1;

public class SumOfNumArray {

	public static int sumofEvenNum(int[] arr) {

		if (arr != null) {
			
			int sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					sum = sum + arr[i];
				}
			}
			return sum;
		}
		return 0;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println(SumOfNumArray.sumofEvenNum(arr));
	}
}
