package pat_cp.string;

import java.util.Scanner;

public class Copystrin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        System.out.print("enter n=");
        int n=sc.nextInt();

        String result=copyLast( s1,n);
       System.out.println(result);
        
    }

    public static String copyLast(String s1,int n){
        StringBuffer s2=new StringBuffer();
        int l=s1.length();

        for(int i=0;i<n;i++){
            s2.append(s1.substring(l-n, l));
        }
        return s2.toString();
    }
}
