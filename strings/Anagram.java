import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter String1=");
        s1=sc.nextLine();
        System.out.print("enter String2=");
        s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length(); 
        char st1[]=s1.toCharArray();
        //   char st1[]=new char[n1];
        //   st1=s1.toCharArray();
          char st2[]=s2.toCharArray();
        //   char st2[]=new char[n2];
        //   st2=s2.toCharArray();
          Arrays.sort(st1);
          Arrays.sort(st2);

        if(n1!=n2){
            System.out.println("not anagram");
            // for(int i=0;i<s1.length();i++){
            //     for(int j=0;j<s2.length();j++){
            //         if(s1.charAt(i)!=s2.charAt(j)){
            //             x=x+1;
            //             break;
                        
            //         }
            //     }
                
            // }
        }
        else{
            for(int i=0;i<n1;i++){
                    if(st1[i]!=st2[i]){
                       System.out.println("not anagram");
                       return;
                        
                    }
                }
                
            


        System.out.println("anagram");
        }
        
    


        
          
     
          

          

    }

}
