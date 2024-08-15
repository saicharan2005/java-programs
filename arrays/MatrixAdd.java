//addition

import java.util.Scanner;

public class MatrixAdd{
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter m=");
        m=sc.nextInt();
        System.out.print("enter n=");
        n=sc.nextInt();
        // int ar[][]={{1,2},{3,4}};

        int a1[][] = new int[m][n];
        int a2[][] = new int[m][n];
        int a3[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a1[i][j] = sc.nextInt();
         
        }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a2[i][j] = sc.nextInt();
         
        }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a3[i][j] = a1[i][j]+a2[i][j];
         
        }
        }
    
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(a3[i][j]+" ");
         
        }
        System.out.println();

        }

    

    }
}