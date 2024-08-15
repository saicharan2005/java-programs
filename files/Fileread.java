import java.io.FileReader;

public class Fileread {
    public static void main(String[] args) {
        try{
            FileReader f3 = new FileReader("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\inter.txt");
        int i;
        while((i=f3.read())!=-1){
            System.out.print((char)i);
        } 
        }catch(Exception e){
           System.out.println("can't read "+e);
        }
}
}