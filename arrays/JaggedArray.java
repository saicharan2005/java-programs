import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar[][]= new int[2][];

        // int ar1[][]= new int[][]{
        //     new int[]{1,2,3},
        //     new int[]{1,2}  };
        // int ar1[][]= {
        //     new int[]{1,2,3},
        //     new int[]{1,2}  };
        // int ar1[][]= {
        //    {1,2,3},
        //   {1,2}  };


        
        
        ar[0] = new int[2];
        ar[1] = new int[4];

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                ar[i][j]=j;
            }
        }


          for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
    
            }
            System.out.println();
        }
    }
    
}
