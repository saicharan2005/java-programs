package pat_cp.string;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string=");
        String st=sc.nextLine();

        if(isPalindrome(st)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }

    }

    public static Boolean isPalindrome(String s){

        String r_s= new StringBuffer(s).reverse().toString();
        
        return s.equals(r_s);

    }
}
