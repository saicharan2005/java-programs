package pat_cp.string;

import java.util.Scanner;

public class Stringcombine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        System.out.print("enter string 2=");
        String s2=sc.nextLine();
        String result=combineString(s1,s2);
       System.out.println(result);
        
    }

    public static  String combineString(String s1,String s2){
        StringBuffer r=new StringBuffer();
        int l1=s1.length();
        int l2=s2.length();

        if(l1<l2){
            // return (s1+s2+s1);
            r.append(s1).append(s2).append(1);
        }
        else{
            // return (s2+s1+s2);
            r.append(s2).append(s1).append(s2);
        }
        return r.toString();
    }
}
