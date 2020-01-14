package coding.Assignment1;

import java.util.Arrays;
public class FindPair{
static void printClosest(int arr[], int n, int x) 
{ 
    int res_l=0, res_r=0;  
           int l = 0, r = n-1, diff = Integer.MAX_VALUE; 
             while (r > l) 
            {           
        if (Math.abs(arr[l] + arr[r] - x) < diff) 
        { 
           res_l = l; 
           res_r = r; 
           diff = Math.abs(arr[l] + arr[r] - x); 
        } 
          if (arr[l] + arr[r] > x) 
           r--; 
        else 
           l++; 
    }
             System.out.println(arr[res_l]);}

//public class FindPair
//{
//	public static void findPair(int[] a, int sum)
//	{
//		int low = 0;
//		int high = a.length - 1;
//Arrays.sort(a);
//		while (low < high)
//		{
//			if (a[low] + a[high] == sum)
//			{
//				System.out.println("Pair found");
//				return;
//			}
//
//			if (a[low] + a[high] < sum) {
//				low++;
//			} else{
//				high--;
//			}
//		}
//
//		System.out.println("Pair not found");
//	}
	public static void main (String[] args)
	{
		int[] a = { 8, 7, 5, 3,2, 1 };
		int x = 10;
		int n=a.length;

		printClosest(a, x,n);
	}
}

//	import java.util.HashMap;
//	import java.util.Map;
//
//	public class FindPair
//	{
//		// Naive method to find a pair in an array with given sum
//		public static void findPair(int[] A, int sum)
//		{
//			// create an empty Hash Map
//			Map<Integer, Integer> map = new HashMap<>();
//
//			// do for each element
//			for (int i = 0; i < A.length; i++)
//			{
//				// check if pair (arr[i], sum-arr[i]) exists
//// if difference is seen before, print the pair
//				if (map.containsKey(sum - A[i]))
//				{
//					System.out.println("Pair found at index " +
//									   map.get(sum - A[i]) + " and " + i);
//					return;
//				}
//
//				// store index of current element in the map
//				map.put(A[i], i);
//			}
//
//			// No pair with given sum exists in the array
//			System.out.println("Pair not found");
//		}
//
//		// Find pair with given sum in the array
//		public static void main (String[] args)
//		{
//			int[] A = { 9,6,3,2,1};
//			int sum = 7;
//
//			findPair(A, sum);
//		}
//	}

