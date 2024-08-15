
import java.util.Scanner;

public class Twod{
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter m=");
        m=sc.nextInt();
        System.out.print("enter n=");
        n=sc.nextInt();
        // int ar[][]={{1,2},{3,4}};
        int[][]arr;
        arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
         
        }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" ");
         
        }
        System.out.println();

        }

    

    }
}

