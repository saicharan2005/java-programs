package pat_cp.string;

import java.util.Scanner;

public class Alternate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        System.out.print("enter string 2=");
        String s2=sc.nextLine();
        String result=addAlternative( s1,s2);
       System.out.println(result);

        
    }
    
    public static  String addAlternative(String s1,String s2){
        StringBuilder r=new StringBuilder();
        int l1=s1.length();
        int l2=s2.length();
        int ml=Math.max(l1, l2);

        for (int i=0;i<ml;i++){
            if(i<l1){
                r.append(s1.charAt(i));
            }
            if(i<l2){
                r.append(s2.charAt(i));
            }

        }
        return r.toString();

    }
}
