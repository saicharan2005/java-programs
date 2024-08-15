import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File1 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\file.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("succefully creatd");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        if(f1.exists()){
            System.out.println(f1.canRead());
            System.out.println(f1.canWrite());
            System.out.println(f1.isDirectory());
        }

        try {
            FileReader f2 = new FileReader("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\file.txt");
            int i;
            // while((i=f2.read())!=-1){
            //     System.out.println((char)i);
            // }
             
             FileWriter f3 = new FileWriter("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs\\newfile.txt");
            //  f3.write("hello how r u");
             

             //file copy
            try {
                
            

             while((i=f2.read())!=-1){
                f3.write(i);
            }
            }finally{
               
               f3.close();
               f2.close();
 
            }

            

            }catch (Exception e) {
            System.out.println(e);
        }
        
       
    }
}
