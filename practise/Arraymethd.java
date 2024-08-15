package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymethd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{4,3,1,2,5};


        int a1[][]={{1,2,3,4,5}};
        int a2[][]={{1,2,3,4,5}};


        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int k=sc.nextInt();
        System.out.println("k found at the "+Arrays.binarySearch(arr, k));
        System.out.println("k found at the "+Arrays.binarySearch(arr, 0,3,k));
        int x[]=Arrays.copyOf(arr, 6);
        int x1[]=Arrays.copyOfRange(arr,0,2);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(x1));



        System.out.println(Arrays.compare(arr, x));
        System.out.println(Arrays.equals(arr, x));
        System.out.println(Arrays.deepEquals(a1, a2));


    }
}
