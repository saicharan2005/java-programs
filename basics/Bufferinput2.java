import java.io.*;


public class Bufferinput2{
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try{
            String s=br.readLine();
            System.out.println(s);
        }catch(Exception e){
        System.out.println(e);
        }
    }
}
