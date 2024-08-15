
import java.io.FileReader;

public class File2 {
    public static void main(String[] args) {
        int c=0;
        int w=1;
        int l=1;
            try {
                FileReader f1 =new FileReader("hello");
                int i;
                while(( i=f1.read())!=-1){
                    if(i!=32){
                        c++;
                    }
                    if(i==32 || i==13){
                        w++;
                    }
                    if(i==13){
                        l++;
                    }

                }

            } catch (Exception e) {
                // TODO: handle exception
            }



        
    }
    
}
