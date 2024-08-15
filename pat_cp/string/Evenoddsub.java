package pat_cp.string;
import java.util.*;

public class Evenoddsub{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string 1=");
        String s1=sc.nextLine();
      
        String result=getFirstHalf( s1);
       System.out.println(result);
        
    }
    public static String getFirstHalf(String s){
        StringBuilder r=new StringBuilder();
        int l=s.length();
        if(l%2==0){
            // return s.substring(0, l/2);
            r.append(s.substring(0, l/2));
            return r.toString();
        }
        return null;
    }
}
