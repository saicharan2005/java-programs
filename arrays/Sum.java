import java.util.Scanner;
public class Sum {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      Sum(arr);

    }


    public static void Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
      System.out.println("sum of array="+sum);


    }
}
