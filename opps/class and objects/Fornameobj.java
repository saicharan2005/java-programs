import java.lang.Class;
public class Fornameobj {
    String name="cherry";
    public static void main(String[] args) {
        try{
            Class cls = Class.forName("Fornameobj");
             

            Fornameobj obj =(Fornameobj)cls.newInstance();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
