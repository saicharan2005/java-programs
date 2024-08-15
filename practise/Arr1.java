package practise;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        // int arr[];
        // arr=new int[10];
        
        int arr1[]=new int[10];
        for (int i=0;i<6;i++){
            arr1[i]=sc.nextInt();
        }

        for (int i=0;i<6;i++){
          System.out.println(arr1[i]);
        }

        

    }
}
