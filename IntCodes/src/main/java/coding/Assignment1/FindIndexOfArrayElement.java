package coding.Assignment1;
public class FindIndexOfArrayElement {
	
	
	public static void findindex(String[] A, String Arrayelement)
	{
		int Index = 0;
		for(int i=0;i<A.length;i++)
		{
		if (A[i] == Arrayelement)
		    {
		    Index = i;
		    }
		}
		System.out.println("The index number of given element "+Arrayelement +  "in the array is : "+ Index);
		
	}

	public static void main(String[] args) {
		
	
	String A[] = {"Red","White","Green","Blue"};
		
	findindex (A, "Blue");
			 
	}

       }
