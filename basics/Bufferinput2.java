import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferinput2 {
    public static void main(String[] args) {
       BufferedReader bd = new BufferedReader(
        new InputStreamReader(System.in)
       );
       String s;
       try{
        System.out.println("enter s=");
        s=bd.readLine();
        System.out.println("name"+s);
       }
       catch(Exception e)
       {
         
       }

    }
}
