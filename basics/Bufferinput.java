import java.io.*;

public class Bufferinput {
    public static void main(String[] args)
    throws IOException{
        BufferedReader bn =new BufferedReader(
            new InputStreamReader(System.in)
           );

         String x= bn.readLine();
         int y= Integer.parseInt(bn.readLine());
         System.out.println(x);
         System.out.println(y);

    }
}
