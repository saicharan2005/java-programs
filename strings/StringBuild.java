import java.lang.StringBuilder;
public class StringBuild {
   public static void main(String[] args) throws Exception {
       StringBuilder s = new StringBuilder("hello");
       System.out.println("string1="+s.toString());
       s.appendCodePoint(45);//the char in int
       System.out.println("string1="+s);
       StringBuilder s1=s.reverse();
       System.out.println("string1="+s1.toString());



   } 
}
