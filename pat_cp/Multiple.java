package pat_cp;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1%num2==0){
            System.out.println(num1+" is multiple of " +num2);
        }
        else{
            System.out.println(num1+" not is multiple of " +num2);
        }
    }
}
