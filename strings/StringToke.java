import java.util.StringTokenizer;

public class StringToke{
    public static void main(String[] args) {
         //constructor 1
        StringTokenizer s1=new StringTokenizer("hello charan how are you");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }

        //constructor 2 with delimeter
         StringTokenizer s2=new StringTokenizer("hello charan-how are you","-");
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }


        //constructor 3 with delimeter flag 
         StringTokenizer s3=new StringTokenizer("hello charan-how are you","-",true);
        while(s3.hasMoreTokens()){
            System.out.println(s3.nextToken());
        }

        String mydelim="-";
        String s="hello-world-iam-java-programming-language";
        StringTokenizer s4=new StringTokenizer(s,mydelim);
         while(s4.hasMoreElements()){
            System.out.println(s4.nextElement());
        }


       
    }
}