
import java.util.Arrays; 

public class Arrmethod { 


	public static void main(String[] args) 
	{ 

		int Arr[] = { 10, 20, 15, 22, 35 }; 
		int Arr2[]={10,15,35,22,5};

		int a1[][]={{1,2,3}};
		int a2[][]={{1,2,3}};

		Arrays.sort(Arr); 

		int k = 22; 


		
		System.out.println( 
			k + " found at index = "
			+ Arrays.binarySearch(Arr, k)); 
		System.out.println( 
			k + " found at index = "
			+ Arrays.binarySearch(Arr,0,3,k)); 

	    System.out.println("compare arr1 and arr2="+Arrays.compare(Arr,Arr2));

		System.out.println(Arrays.toString(Arrays.copyOf(Arr,6)));
		System.out.println(Arrays.toString( Arrays.copyOfRange(Arr,0,2)));
		System.out.println( Arrays.equals(a1, a2));
		System.out.println( Arrays.deepEquals(a1, a2));

		
		System.out.println( "mismatch at index"+Arrays.mismatch(Arr,Arr2));
       
		System.out.println(Arrays.toString(Arr));//sort of arr1 done at up 
		Arrays.sort(Arr2,0,4);
		System.out.println(Arrays.toString(Arr2));


		
	} 
}
