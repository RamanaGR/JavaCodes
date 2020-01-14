package coding.Assignment1;

public class SortWOmeth {
	public static void main(String arg[]) {
		int[] arr= {5,4,8,3,2,9};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	  public static void sort(int nos[]) {
		     for (int i = 1; i < nos.length; i++){
		          int j = i;//1  2 3  
		          int B = nos[i];//4 8 3
		          while ((j > 0) && (nos[j-1] > B)){
		            nos[j] = nos[j-1];//5  8 4 5
		            j--;//-1  2 1 0
		          }
		          nos[j] = B;//3 4 8   
		        }     
		    }
}
