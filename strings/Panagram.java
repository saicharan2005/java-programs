import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        String s1;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string=");
        s1=sc.nextLine().toLowerCase();
        boolean present[]=new boolean[26];
        for(int i=0;i<s1.length();i++){
            int ind=s1.charAt(i)-'a';
            if(ind>=0 && ind<=25){
                if(!present[i]){
                present[ind]=true;
                }
            }
           
        }
        for(int i=0;i<26;i++){
            
            if(!present[i]){
               System.out.println("not Panagram");
               return;
            }
           
        }
        System.out.println("panagram");
             

    }
    
}
