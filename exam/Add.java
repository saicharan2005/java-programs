import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        int a,b,ch,sum;
        Scanner sc=new Scanner(System.in);
       do{
        System.out.print("enter a=");
        a=sc.nextInt();
         System.out.print("enter b=");
        b=sc.nextInt();
          
        sum=a+b;
        System.out.println("sum="+sum);

        System.out.print("enter 1 to continue=");
        ch=sc.nextInt();
    }while(ch==1);
    }
}
