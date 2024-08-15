package pat_cp.string;

import java.util.Scanner;

public class Substrin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        
        String result= withOutFirstLast( s1);
       System.out.println(result);
        
    }
    public static String withOutFirstLast( String s1){
        StringBuffer r=new StringBuffer();
        int l=s1.length();
        if(l<=2){
            return "";
        }
        else{
            r.append(s1.substring(1,l-1));
            return r.toString();
        }
    }

}
