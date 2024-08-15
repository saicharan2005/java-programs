import java.io.File;

public class Filedemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\RAKESH KUNDURU\\Downloads\\java\\java-programs");
        File f2= new File("test.txt");
        p(f1.getName());
        p(f1.getAbsolutePath());
        p(f1.getPath());
        p(f1.getParent());
        // p(f2.exists());
        // p(f2.canRead());
        // p(f2.canWrite());
        // p(f1.isAbsolute());
        // p(f1.isDirectory());
        // p(f1.lastModified());
        

    }
}
