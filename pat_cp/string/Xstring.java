package pat_cp.string;

import java.util.Scanner;

public class Xstring{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        String result=checkXstring(s1);
       System.out.println(result);
        
    }

    public static String checkXstring(String s1){
        StringBuffer r=new StringBuffer();
        int l=s1.length();
        if(s1.charAt(0)=='x' && s1.charAt(l-1)=='x'){
            r.append(s1.substring(1,l-1));
        } 
        else{
            r.append(s1);
        }
        return r.toString();
}
}
