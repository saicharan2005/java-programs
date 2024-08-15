import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Reflexive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=(int[]) Array.newInstance(int.class,5);

        System.out.println(Arrays.toString(arr));


        //adding using set x method
        
        System.out.println("enter element and index");
        int ele=sc.nextInt();
        int ind=sc.nextInt();

        Array.setInt(arr,ele,ind);
        Array.setInt(arr,1,2);
        
        // System.out.println(Arrays.toString(arr)); here we used java.utilArrays

        //retrive the data

        System.out.println(Array.getInt(arr,0));
        System.out.println(Array.getInt(arr,2));
        System.out.println(Array.getInt(arr,3));
    }
    
}
