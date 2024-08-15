import java.util.Scanner;
public class Maxmin{
    public static void main(String[] args) {
        int num,ch;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        Scanner sc=new Scanner(System.in);
       do{
        System.out.print("enter num=");
        num=sc.nextInt();
        if(num>max){
            max=num;
        }
        if(num<min) {
            min=num;
        }
          
    
    

        System.out.print("enter 1 to continue=");
        ch=sc.nextInt();
    }while(ch==1);

     System.out.println("max="+max);
      System.out.println("min="+min);
    }
}

