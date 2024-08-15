package practise;

import java.util.Scanner;

public class Sum1{
    public static int n;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);


        int arr[]=new int[10];
        System.out.print("enter n=");
        n=sc.nextInt();
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Sum(arr);
    }

    static void Sum(int[] arr) {

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}
