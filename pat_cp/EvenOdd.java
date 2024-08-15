package pat_cp;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter num =");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("given num is even");
        }
        else{
            System.out.println("given num is odd");
        }
    }
}
