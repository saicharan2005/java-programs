import java.io.FileReader;

public class FileReadcount {
    public static void main(String[] args) {
          int c=0,wc=1,lc=1;
         try{
            FileReader f3 = new FileReader("inter.txt");
        int i;
      
        while((i=f3.read())!=-1){
            if(i!=32){
               c++;  
            }
            //count inc
            if(i==32 || i==13){   //32=space  ans 13==new line
               wc++;
            }
            if(i==13){
                lc++;
            }
            
        } 
        System.out.printf("character count=%d\nword count=%d\nlines count=%d",c,wc,lc);
        }catch(Exception e){
           System.out.println("cant read "+e);
        }
    }
}

