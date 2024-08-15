package pat_cp.string;

import java.util.Scanner;

public class Starremove {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        
        String result=removeStar( s1);
       System.out.println(result);
    }
    public static String removeStar(String s1){
        StringBuffer r= new StringBuffer();
        r.append(s1);
        
        int i=s1.indexOf('*');
        if(i>=1 && i<=s1.length()-1){
             r.delete(i-1, i+2);
        }
       
        return r.toString();
    }
}
