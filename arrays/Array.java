
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[];                    //array decleration
        arr= new int[10];             //assigning memory to array
        // int[] array3=new int[10];          
        int[] arr2 =new int[]{1,2,3,4}; //array literal
        arr[0]=10;  
                                     //assign data
        for(int i=1;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
                                      // accessing data
        for(int i=0;i<arr2.length;i++){
            System.out.printf("%d ",arr2[i]);
        }
        System.out.println();
        for (int var : arr) {
            System.out.printf("%d ",var);
             
        }
    }
}
