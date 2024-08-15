import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string =");
        s=sc.nextLine();
        int n=s.length();
        boolean x=true;
        for(int i=0,j=n-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                    x=false;
                    break;            
            }
        }
        if(x){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Paindrome");
        }



    }
}
