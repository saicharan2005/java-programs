
package pat_cp;

import java.util.Scanner;

public class Prime{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter num=");
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            int c=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.println("prime="+i);
            }
        }
    }
}