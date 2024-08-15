package pat_cp.string;

import java.util.Scanner;

public class Copystring {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        String result=copyFirst( s1);
       System.out.println(result);
        
    }

    public static String copyFirst(String s1){
        StringBuffer s2=new StringBuffer();
        int n=s1.length();

        for(int i=0;i<n;i++){
            s2.append(s1.substring(0, 2));
        }
        return s2.toString();
    }
}
