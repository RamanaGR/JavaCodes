package coding.Assignment1;

public class SumofConsicutive {
//	public int getMaxOfConsecutiveOnes(int[] arr) {
//
//		int sum = 0;
//		int finalSum = 0;

//		if(arr == null || arr.length == 0) {
//
//		 return sum;
//		}
//
//		if(arr == null || arr.length == 0) {
//			return finalSum;
//		}
//		boolean oneStarted = false;
//
//		for(int i : arr) {
//			
//			if(!oneStarted && i == 1) {
//
//				sum =+ 1;
//				oneStarted = true;
//			} else 
//	{
//		oneStarted = false;
//		if(sum > finalSum) {
//		finalSum = sum;
//		}
//		sum = 0;
//
//		}
//		
//
//		}

		
//		else {
//			for(int i=0;i<arr.length-1;i++) {
//				
//				if(arr[i]+arr[i+1] == 2) {
//					finalSum+=1;
//				}
//				
//			}
//		}

//	return finalSum;
//
//
//	}
		public static int getMaxOfConsecutiveOnes(int[] arr) {

			int sum = 0;
			int finalSum = 0;
	        int length = arr.length;
	        
			if (arr == null || arr.length == 0) {

				return sum;
			}
			
			for (int i : arr) {

				if (i == 1) {

					sum += 1;
					
				} 
				else {
					
					if (sum > finalSum) {
						finalSum = sum;
					}
					sum = 0;
				}
		if(sum > finalSum) {
					finalSum = sum;
				}
			}

			return finalSum;
	}
	public static void main(String[] args) {
		int arr[] = {1, 1,1, 0, 0, 1, 0,1,1,1,1,1};
		//SumofConsicutive a=new SumofConsicutive();
		System.out.println(SumofConsicutive.getMaxOfConsecutiveOnes(arr));
		
	}
}//write a program to get sum of consecutive one's from array int arr[] = {1, 1,1, 0, 0, 1, 0,1,1,1,1,1};
