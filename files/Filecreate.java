import java.io.*;
public class Filecreate {
    public static void main(String[] args) {
        File f= new  File("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\charan.txt");
        try{
            if(f.createNewFile()){
                System.out.println("file Sucessfully");
            }
        }catch(Exception e){
            System.out.println("file not created");

        }
        try{
             FileWriter f1 = new FileWriter("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\inter.txt");
             try {
                f1.write("Inter-thread communication in Java is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.");
             }
             finally{
                f1.close();
             }
            System.out.println("sucessfull data wrote in charan file ");    

        }catch (Exception e) {
             System.out.println(" data not  wrote in charan file ");  
             }

        try{
            FileReader f3 = new FileReader("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\arrays\\charan.txt");
        int i;
        while((i=f3.read())!=-1){
            System.out.print((char)i);
        } 
        }catch(Exception e){
           System.out.println("cant read "+e);
        }

        try{
            FileWriter f4 =new FileWriter("hello");
            f4.write("hellofhfjh");
        }
        catch{
            System.out.println("cant write");
        }
       
             
             
       
        

      
       

        
    }
    
}
