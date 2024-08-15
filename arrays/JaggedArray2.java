import java.util.Scanner;
public class JaggedArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        int a[][]=new int[m][];
         System.out.println("enter Sizes");
        for(int i=0;i<m;i++){
            n=sc.nextInt();
            a[i]= new int[n];
        }
         System.out.println("enter data");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("print data");
        

         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
