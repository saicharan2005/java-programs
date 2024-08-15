import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        int guess,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter guess number=");
        guess=sc.nextInt();
        boolean b=false;
       do{
        
        System.out.print("enter num=");
        num=sc.nextInt();
        
        if(num==guess){
            b=true;
            System.out.println("guess num is correct");
        }
        else if (num>guess){
            System.out.println("guessed num is greater");

        }
         else {
            System.out.println("guessed num is least");

        }
          

    
    }while(!b);
    }
}