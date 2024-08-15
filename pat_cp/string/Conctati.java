package pat_cp.string;

import java.util.Scanner;

public class Conctati {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
        System.out.print("enter string 2=");
        String s2=sc.nextLine();
        String result=add( s1.toLowerCase(),s2.toLowerCase());
       System.out.println(result);
        
    }
    public static  String add(String s1,String s2){
        StringBuilder r=new StringBuilder();
        int l1=s1.length();
        int l2=s2.length();

        if(s1.charAt(l1-1)!=(s2.charAt(0))){
            // return (s1+" "+s2);
            r.append(s1).append(" ").append(s2);
        }
        else{
            String s;
            s=s2.substring(1, l2);
            // return (s1+s);
            r.append(s1).append(s);
        }
        return r.toString();
    }


}
