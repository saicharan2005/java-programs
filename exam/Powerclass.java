import java.util.Scanner;
public class Powerclass{
    public static void main(String[] args) {
        int a,b;
         Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
        int ans=a;
         for(int i=1;i<b;i++){
            ans*=a;

         }
         System.out.println(ans);

    }
}
