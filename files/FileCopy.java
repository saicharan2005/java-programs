import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
         try{
            FileReader f3 = new FileReader("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\inter.txt");
            FileWriter f1 = new FileWriter("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\copy.txt");
        int i;
        try{
            while((i=f3.read())!=-1){
                f1.write(i);
                }
                
        }
        finally{
                f3.close();
                f1.close();
        }
        }
        catch(Exception e){
           System.out.println("cant read  and cant write"+e);
        }
        
            



}
}
